from tkinter import * 
from tkinter.ttk import *

from time import strftime

from pyfirmata import Arduino, SERVO

root = Tk()
root.title('Reloj Analógico')
root.geometry("400x400")
board = Arduino('COM3')
board.digital[6].mode = SERVO
board.digital[3].mode = SERVO
def getMinutes(minutes):
    return minutes * 3

def getHours(hours):
    if hours <= 12:
        return 180 - (hours*15)
    return 180 - ( (hours - 12) * 15)

def time():
    string = strftime('%H:%M:%S %p')
    minutes = getMinutes( int(strftime('%M')) )
    hours = getHours(  int(strftime('%H')) )
    board.digital[6].write(minutes)
    board.digital[3].write(hours)
    print(minutes)
    print(hours)
    print( board)
    board.digital[13].write(1)
    
    lbl.config(text = string)
    lbl.after(1000, time)

lbl = Label(root, font = ('calibri', 40, 'bold'),
            background = 'purple',
            foreground = 'white')

lbl.pack(anchor = 'center')
time()
  
mainloop()