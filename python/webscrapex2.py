import bs4 as bs
import urllib.request

sauce = urllib.request.urlopen('https://pythonprogramming.net/navigating-pages-scraping-parsing-beautiful-soup-tutorial/').read()
soup = bs.BeautifulSoup(sauce,'lxml')

nav = soup.nav

for url in nav.find_all('a'):
   print(url.get('href'))
