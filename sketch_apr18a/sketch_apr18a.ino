#include <Servo.h>

Servo minutero;
Servo hora;

int anguloMinutero = 0;
int anguloHora = 180;

void setup() {
  minutero.attach(2);
  hora.attach(3);
}

void loop() {
  /*
  servo a 0 grados
  servo a 90 grados
  servo a 180 grados
  servo a 270 grados
  */
  
  hora.write(112);
  minutero.write(anguloHora);
  delay(500);
  if(anguloHora <= 5){
    anguloHora = 180;
  }else{
    anguloHora = anguloHora - 15;
  }
  if(anguloMinutero >= 170){
    anguloMinutero = 0;
  }else{
  anguloMinutero = anguloMinutero + 15;
  }
}
