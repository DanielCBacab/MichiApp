package com.example.yorlygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    int tablero[][];
    ImageButton tableroVisual[][];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarTablero();
        imprimirTablero();


    }

    /*
    Funcion encargada de crear un nuevo tablero de juego recorriendo
    cada casilla en el gato para establecer el valor de cero en cada una de ellas
    */
    public void inicializarTablero(){
        tablero = new int [3][3];
        for (int x=0;x<=2;x++){
            for(int y=2;y>=0;y--){
                tablero[x][y] = 0;

            }
        }

        tableroVisual = new ImageButton[3][3];

        // this.TextViewR1 = (EditText) findViewById(R.id.RedOneTextView);
        this.tableroVisual[0][0] = (ImageButton) findViewById(R.id.imageButton00);
        this.tableroVisual[1][0] = (ImageButton) findViewById(R.id.imageButton10);
        this.tableroVisual[2][0] = (ImageButton) findViewById(R.id.imageButton20);
        this.tableroVisual[0][1] = (ImageButton) findViewById(R.id.imageButton01);
        this.tableroVisual[1][1] = (ImageButton) findViewById(R.id.imageButton11);
        this.tableroVisual[2][1] = (ImageButton) findViewById(R.id.imageButton21);
        this.tableroVisual[0][2] = (ImageButton) findViewById(R.id.imageButton02);
        this.tableroVisual[1][2] = (ImageButton) findViewById(R.id.imageButton12);
        this.tableroVisual[2][2] = (ImageButton) findViewById(R.id.imageButton22);
    }

    //Esta funcion se encarga de mostrar en pantalla el tablero de juego
    public void imprimirTablero(){

        for (int x=0;x<=2;x++){
            for(int y=2;y>=0;y--){

                switch (this.tablero[x][y]){
                    case 0 :
                        tableroVisual[x][y].setImageResource(R.drawable.circle);
                        break;

                    case 1 :
                        tableroVisual[x][y].setImageResource(R.drawable.mark);
                        break;
                    case 2 :
                        tableroVisual[x][y].setImageResource(R.drawable.circle);
                        break;
                }
            }
        }
    }


}