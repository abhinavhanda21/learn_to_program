import time
from flask import Flask, jsonify
from multiprocessing import Process, Value
import webbrowser
import random



app = Flask(__name__)


tasks = [
   {
      'id': 1,
      'title': u'Buy groceries',
      'description': u'Milk, Cheese, Pizza, Fruit, Tylenol', 
      'done': False
   },
   {
      'id': 2,
      'title': u'Learn Python',
      'description': u'Need to find a good Python tutorial on the web', 
      'done': False
   }
]


@app.route('/todo/api/v1.0/tasks', methods=['GET'])
def get_tasks():
   return jsonify({'tasks': tasks})


def record_loop(loop_on):
   while True:
      if loop_on.value == True:
            sites = random.choice(['youtu.be/c_fFvasBX-4?t=16', 'youtu.be/QEfg-iMNrW8?t=2','youtu.be/Avc6ojPPZek?t=8'])
            visit = "http://{}".format(sites)
            webbrowser.open(visit)
            seconds = random.randrange(5, 20)
            time.sleep(seconds)


if __name__ == "__main__":
   recording_on = Value('b', True)
   p = Process(target=record_loop, args=(recording_on,))
   p.start()  
   app.run(debug=True, use_reloader=False)
   p.join()
