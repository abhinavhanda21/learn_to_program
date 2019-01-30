import bs4
from urllib.request import urlopen as uReq
from bs4 import BeautifulSoup as soup

my_url = 'https://www.newegg.com/Product/ProductList.aspx?Submit=ENE&DEPA=0&Order=BESTMATCH&Description=graphic+cRDS&ignorear=0&N=-1&isNodeId=1'
uReq(my_url)

######opening up connection, grabbing the page
uClient = uReq(my_url)
page_html = uClient.read()
#uCLient.close()

#uClient.close()

#####html parsing
page_soup = soup(page_html, "html.parser")
#page_soup.h1 


#grabs each product
containers = page_soup.findAll("div", {"class":"item-container"})

filename = "products.csv"
f = open(filename, "w")

header = "brand, product_title, shipping\n"

f.write(header)

for container in containers:
    title_container = container.findAll("a", {"class":"item-title"})
    brand = title_container[0].text

    img_container = container.findAll("a", {"class":"item-img"})
    product_title = img_container[0].img["title"]

    shipping_container = container.findAll("li", {"class":"price-ship"})
    shipping = shipping_container[0].text.strip()

    print("brand: " + brand)
    print("product_title: " + product_title)
    print("shipping: " + shipping)

    f.write(brand + "," + product_title.replace(",", "|") + "," + shipping + "\n")


f.close()
