import bs4 as bs
import urllib.request

sauce = urllib.request.urlopen('https://casa.sapo.pt/Venda/Apartamentos/?sa=11&lp=10000&or=10').read()
soup = bs.BeautifulSoup(sauce,'lxml')

#print(soup.find_all('p'))

#for paragraph in soup.find_all('p'):
##   print(paragraph.text)

#print(soup.get_text())

for url in soup.find_all('a'):
   print(url.get('href'))
