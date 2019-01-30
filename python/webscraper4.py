import bs4
from urllib.request import urlopen as uReq
from bs4 import BeautifulSoup as soup

my_url = "https://www.instagram.com"
uReq(my_url)

uClient = uReq(my_url)
page_html = uClient.read()

page_soup = soup(page_html, "html.parser")


containers = page_soup.find("meta", property="og:description")['content']
info = containers

print(info)
