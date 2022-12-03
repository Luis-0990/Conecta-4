import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Tablero {

    private JPanel panel_p;
    private JLabel Coordenada_V1_1;
    private JLabel Coordenada_V1_2;
    private JLabel Coordenada_V1_3;
    private JLabel Coordenada_V1_4;
    private JLabel Coordenada_V1_5;
    private JLabel Coordenada_V1_6;
    private JLabel Coordenada_V2_1;
    private JLabel Coordenada_V2_2;
    private JLabel Coordenada_V2_3;
    private JLabel Coordenada_V2_4;
    private JLabel Coordenada_V2_5;
    private JLabel Coordenada_V2_6;
    private JLabel Coordenada_V3_1;
    private JLabel Coordenada_V3_2;
    private JLabel Coordenada_V3_3;
    private JLabel Coordenada_V3_4;
    private JLabel Coordenada_V3_5;
    private JLabel Coordenada_V3_6;
    private JLabel Coordenada_V4_1;
    private JLabel Coordenada_V4_2;
    private JLabel Coordenada_V4_3;
    private JLabel Coordenada_V4_4;
    private JLabel Coordenada_V4_5;
    private JLabel Coordenada_V4_6;
    private JLabel Coordenada_V5_1;
    private JLabel Coordenada_V5_2;
    private JLabel Coordenada_V5_3;
    private JLabel Coordenada_V5_4;
    private JLabel Coordenada_V5_5;
    private JLabel Coordenada_V5_6;
    private JLabel Coordenada_V6_1;
    private JLabel Coordenada_V6_2;
    private JLabel Coordenada_V6_3;
    private JLabel Coordenada_V6_4;
    private JLabel Coordenada_V6_5;
    private JLabel Coordenada_V6_6;
    private JButton v3Button;
    private JButton v4Button;
    private JButton v5Button;
    private JButton v6Button;
    private JButton v2Button;
    private JButton v1Button;
    private JLabel Anuncio;
    private JLabel imagen;
    private ImageIcon fiVacia=new ImageIcon("resources/Imagenes/Ficha_Vacia.png");
    private ImageIcon fiRojo=new ImageIcon("resources/Imagenes/Ficha Rojo.png");
    private ImageIcon fiAmarilla=new ImageIcon("resources/Imagenes/Ficha Amarilla.png");

    boolean x=true;
    int i1=0;
    int i2=0;
    int i3=0;
    int i4=0;
    int i5=0;
    int i6=0;

    public Tablero() {
        Coordenada_V1_1.setIcon(fiVacia);
        Coordenada_V1_2.setIcon(fiVacia);
        Coordenada_V1_3.setIcon(fiVacia);
        Coordenada_V1_4.setIcon(fiVacia);
        Coordenada_V1_5.setIcon(fiVacia);
        Coordenada_V1_6.setIcon(fiVacia);

        Coordenada_V2_1.setIcon(fiVacia);
        Coordenada_V2_2.setIcon(fiVacia);
        Coordenada_V2_3.setIcon(fiVacia);
        Coordenada_V2_4.setIcon(fiVacia);
        Coordenada_V2_5.setIcon(fiVacia);
        Coordenada_V2_6.setIcon(fiVacia);

        Coordenada_V3_1.setIcon(fiVacia);
        Coordenada_V3_2.setIcon(fiVacia);
        Coordenada_V3_3.setIcon(fiVacia);
        Coordenada_V3_4.setIcon(fiVacia);
        Coordenada_V3_5.setIcon(fiVacia);
        Coordenada_V3_6.setIcon(fiVacia);

        Coordenada_V4_1.setIcon(fiVacia);
        Coordenada_V4_2.setIcon(fiVacia);
        Coordenada_V4_3.setIcon(fiVacia);
        Coordenada_V4_4.setIcon(fiVacia);
        Coordenada_V4_5.setIcon(fiVacia);
        Coordenada_V4_6.setIcon(fiVacia);

        Coordenada_V5_1.setIcon(fiVacia);
        Coordenada_V5_2.setIcon(fiVacia);
        Coordenada_V5_3.setIcon(fiVacia);
        Coordenada_V5_4.setIcon(fiVacia);
        Coordenada_V5_5.setIcon(fiVacia);
        Coordenada_V5_6.setIcon(fiVacia);

        Coordenada_V6_1.setIcon(fiVacia);
        Coordenada_V6_2.setIcon(fiVacia);
        Coordenada_V6_3.setIcon(fiVacia);
        Coordenada_V6_4.setIcon(fiVacia);
        Coordenada_V6_5.setIcon(fiVacia);
        Coordenada_V6_6.setIcon(fiVacia);

        v1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(i1!=6) {
                    x = CambioDeJugador(x);
                    if (i1 < 6 && x == true) {
                        PonerRojoV1(i1++);
                    }
                    if (i1 < 6 && x == false) {
                        PonerAmarrilloV1(i1++);
                    }
                    if (i1 == 6) {
                        Anuncio.setText("COLUMNA LLENA");
                    }
                    GanadorFilaV();
                    GanadorFilaH();
                    GanadorDiagolnalI_a_D();
                    GanadorDiagolnalDer_a_Izq();
                }
            }
        });
        v2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i2 != 6) {
                    x = CambioDeJugador(x);
                    if (i2 < 6 && x == true) {
                        PonerRojoV2(i2++);
                    }
                    if (i2 < 6 && x == false) {
                        PonerAmarrilloV2(i2++);
                    }
                    if (i2 == 6) {
                        Anuncio.setText("COLUMNA LLENA");
                    }
                    GanadorFilaV();
                    GanadorFilaH();
                    GanadorDiagolnalI_a_D();
                    GanadorDiagolnalDer_a_Izq();
                }
            }
        });
        v3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i3 != 6) {
                    x = CambioDeJugador(x);
                    if (i3 < 6 && x == true) {
                        PonerRojoV3(i3++);
                    }
                    if (i3 < 6 && x == false) {
                        PonerAmarrilloV3(i3++);
                    }
                    if (i3 == 6) {
                        Anuncio.setText("COLUMNA LLENA");
                    }
                    GanadorFilaV();
                    GanadorFilaH();
                    GanadorDiagolnalI_a_D();
                    GanadorDiagolnalDer_a_Izq();
                }
            }
        });
        v4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i4 != 6) {
                    x = CambioDeJugador(x);
                    if (i4 < 6 && x == true) {
                        PonerRojoV4(i4++);
                    }
                    if (i4 < 6 && x == false) {
                        PonerAmarrilloV4(i4++);
                    }
                    if (i4 == 6) {
                        Anuncio.setText("COLUMNA LLENA");
                    }
                    GanadorFilaV();
                    GanadorFilaH();
                    GanadorDiagolnalI_a_D();
                    GanadorDiagolnalDer_a_Izq();
                }
            }
        });
        v5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i5 != 6) {
                    x = CambioDeJugador(x);
                    if (i5 < 6 && x == true) {
                        PonerRojoV5(i5++);
                    }
                    if (i5 < 6 && x == false) {
                        PonerAmarrilloV5(i5++);
                    }
                    if (i5 == 6) {
                        Anuncio.setText("COLUMNA LLENA");
                    }
                    GanadorFilaV();
                    GanadorFilaH();
                    GanadorDiagolnalI_a_D();
                    GanadorDiagolnalDer_a_Izq();
                }
            }
        });
        v6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i6 != 6) {
                    x = CambioDeJugador(x);
                    if (i6 < 6 && x == true) {
                        PonerRojoV6(i6++);
                    }
                    if (i6 < 6 && x == false) {
                        PonerAmarrilloV6(i6++);
                    }
                    if (i6 == 6) {
                        Anuncio.setText("COLUMNA LLENA");
                    }
                    GanadorFilaV();
                    GanadorFilaH();
                    GanadorDiagolnalI_a_D();
                    GanadorDiagolnalDer_a_Izq();
                }
            }
        });
    }
    ////////Arreglos de las columnas////////
    JLabel Columna1[]={Coordenada_V1_1,Coordenada_V1_2,Coordenada_V1_3,Coordenada_V1_4,Coordenada_V1_5,Coordenada_V1_6};
    JLabel Columna2[]={Coordenada_V2_1,Coordenada_V2_2,Coordenada_V2_3,Coordenada_V2_4,Coordenada_V2_5,Coordenada_V2_6};
    JLabel Columna3[]={Coordenada_V3_1,Coordenada_V3_2,Coordenada_V3_3,Coordenada_V3_4,Coordenada_V3_5,Coordenada_V3_6};
    JLabel Columna4[]={Coordenada_V4_1,Coordenada_V4_2,Coordenada_V4_3,Coordenada_V4_4,Coordenada_V4_5,Coordenada_V4_6};
    JLabel Columna5[]={Coordenada_V5_1,Coordenada_V5_2,Coordenada_V5_3,Coordenada_V5_4,Coordenada_V5_5,Coordenada_V5_6};
    JLabel Columna6[]={Coordenada_V6_1,Coordenada_V6_2,Coordenada_V6_3,Coordenada_V6_4,Coordenada_V6_5,Coordenada_V6_6};
    //////COLUMNA 1//////
    public void PonerRojoV1(int i){
        Columna1[i].setIcon(fiRojo);
    }
    public void PonerAmarrilloV1(int i){
        Columna1[i].setIcon(fiAmarilla);
    }
    //////COLUMNA 2//////
    public void PonerRojoV2(int i){
        Columna2[i].setIcon(fiRojo);
    }
    public void PonerAmarrilloV2(int i){
        Columna2[i].setIcon(fiAmarilla);
    }
    //////COLUMNA 3//////
    public void PonerRojoV3(int i){
        Columna3[i].setIcon(fiRojo);
    }
    public void PonerAmarrilloV3(int i){
        Columna3[i].setIcon(fiAmarilla);
    }
    //////COLUMNA 4//////
    public void PonerRojoV4(int i){
        Columna4[i].setIcon(fiRojo);
    }
    public void PonerAmarrilloV4(int i){
        Columna4[i].setIcon(fiAmarilla);
    }
    //////COLUMNA 5//////
    public void PonerRojoV5(int i){
        Columna5[i].setIcon(fiRojo);
    }
    public void PonerAmarrilloV5(int i){
        Columna5[i].setIcon(fiAmarilla);
    }
    //////COLUMNA 6//////
    public void PonerRojoV6(int i){
        Columna6[i].setIcon(fiRojo);
    }
    public void PonerAmarrilloV6(int i){
        Columna6[i].setIcon(fiAmarilla);
    }

    boolean  CambioDeJugador(boolean x){
        if(x==true){
            x=false;
            imagen.setIcon(fiRojo);
            Anuncio.setText("Turno de:  ");
        }else{
            x=true;
            imagen.setIcon(fiAmarilla);
            Anuncio.setText("Turno de:  ");
        }
        return x;
    }
    public void GanadorFilaV() {//Verifica las lineas verticales si conecta 4
        for (int i = 0; i <= 2; i++) {
            if (Columna1[i].getIcon().equals(fiAmarilla)&&Columna1[i+1].getIcon().equals(fiAmarilla)
                    &&Columna1[i+2].getIcon().equals(fiAmarilla)&&Columna1[i+3].getIcon().equals(fiAmarilla)
                    ||Columna2[i].getIcon().equals(fiAmarilla)&&Columna2[i+1].getIcon().equals(fiAmarilla)
                    &&Columna2[i+2].getIcon().equals(fiAmarilla)&&Columna2[i+3].getIcon().equals(fiAmarilla)
                    ||Columna3[i].getIcon().equals(fiAmarilla)&&Columna3[i+1].getIcon().equals(fiAmarilla)
                    &&Columna3[i+2].getIcon().equals(fiAmarilla)&&Columna3[i+3].getIcon().equals(fiAmarilla)
                    ||Columna4[i].getIcon().equals(fiAmarilla)&&Columna4[i+1].getIcon().equals(fiAmarilla)
                    &&Columna4[i+2].getIcon().equals(fiAmarilla)&&Columna4[i+3].getIcon().equals(fiAmarilla)
                    ||Columna5[i].getIcon().equals(fiAmarilla)&&Columna5[i+1].getIcon().equals(fiAmarilla)
                    &&Columna5[i+2].getIcon().equals(fiAmarilla)&&Columna5[i+3].getIcon().equals(fiAmarilla)
                    ||Columna6[i].getIcon().equals(fiAmarilla)&&Columna6[i+1].getIcon().equals(fiAmarilla)
                    &&Columna6[i+2].getIcon().equals(fiAmarilla)&&Columna6[i+3].getIcon().equals(fiAmarilla)) {
                      Anuncio.setText("¡¡Ganador!!  ");
                      imagen.setIcon(fiAmarilla);
                      Recetiar();
                      //Tiempo();
            }if (Columna1[i].getIcon().equals(fiRojo)&&Columna1[i+1].getIcon().equals(fiRojo)
                    &&Columna1[i+2].getIcon().equals(fiRojo)&&Columna1[i+3].getIcon().equals(fiRojo)
                    ||Columna2[i].getIcon().equals(fiRojo)&&Columna2[i+1].getIcon().equals(fiRojo)
                    &&Columna2[i+2].getIcon().equals(fiRojo)&&Columna2[i+3].getIcon().equals(fiRojo)
                    ||Columna3[i].getIcon().equals(fiRojo)&&Columna3[i+1].getIcon().equals(fiRojo)
                    &&Columna3[i+2].getIcon().equals(fiRojo)&&Columna3[i+3].getIcon().equals(fiRojo)
                    ||Columna4[i].getIcon().equals(fiRojo)&&Columna4[i+1].getIcon().equals(fiRojo)
                    &&Columna4[i+2].getIcon().equals(fiRojo)&&Columna4[i+3].getIcon().equals(fiRojo)
                    ||Columna5[i].getIcon().equals(fiRojo)&&Columna5[i+1].getIcon().equals(fiRojo)
                    &&Columna5[i+2].getIcon().equals(fiRojo)&&Columna5[i+3].getIcon().equals(fiRojo)
                    ||Columna6[i].getIcon().equals(fiRojo)&&Columna6[i+1].getIcon().equals(fiRojo)
                    &&Columna6[i+2].getIcon().equals(fiRojo)&&Columna6[i+3].getIcon().equals(fiRojo)) {
                      Anuncio.setText("¡¡Ganador!!  ");
                      imagen.setIcon(fiRojo);
                      Recetiar();
            }
        }
    }
    ////////Arreglos de las filas////////
    JLabel Fila1[]={Coordenada_V1_1,Coordenada_V2_1,Coordenada_V3_1,Coordenada_V4_1,Coordenada_V5_1,Coordenada_V6_1};
    JLabel Fila2[]={Coordenada_V1_2,Coordenada_V2_2,Coordenada_V3_2,Coordenada_V4_2,Coordenada_V5_2,Coordenada_V6_2};
    JLabel Fila3[]={Coordenada_V1_3,Coordenada_V2_3,Coordenada_V3_3,Coordenada_V4_3,Coordenada_V5_3,Coordenada_V6_3};
    JLabel Fila4[]={Coordenada_V1_4,Coordenada_V2_4,Coordenada_V3_4,Coordenada_V4_4,Coordenada_V5_4,Coordenada_V6_4};
    JLabel Fila5[]={Coordenada_V1_5,Coordenada_V2_5,Coordenada_V3_5,Coordenada_V4_5,Coordenada_V5_5,Coordenada_V6_5};
    JLabel Fila6[]={Coordenada_V1_6,Coordenada_V2_6,Coordenada_V3_6,Coordenada_V4_6,Coordenada_V5_6,Coordenada_V6_6};
    public void GanadorFilaH() {//Verifica las lineas horizontales si conecta 4
        for (int i = 0; i <= 2; i++) {
            if (Fila1[i].getIcon().equals(fiAmarilla)&&Fila1[i+1].getIcon().equals(fiAmarilla)
                    &&Fila1[i+2].getIcon().equals(fiAmarilla)&&Fila1[i+3].getIcon().equals(fiAmarilla)
                    ||Fila2[i].getIcon().equals(fiAmarilla)&&Fila2[i+1].getIcon().equals(fiAmarilla)
                    &&Fila2[i+2].getIcon().equals(fiAmarilla)&&Fila2[i+3].getIcon().equals(fiAmarilla)
                    ||Fila3[i].getIcon().equals(fiAmarilla)&&Fila3[i+1].getIcon().equals(fiAmarilla)
                    &&Fila3[i+2].getIcon().equals(fiAmarilla)&&Fila3[i+3].getIcon().equals(fiAmarilla)
                    ||Fila4[i].getIcon().equals(fiAmarilla)&&Fila4[i+1].getIcon().equals(fiAmarilla)
                    &&Fila4[i+2].getIcon().equals(fiAmarilla)&&Fila4[i+3].getIcon().equals(fiAmarilla)
                    ||Fila5[i].getIcon().equals(fiAmarilla)&&Fila5[i+1].getIcon().equals(fiAmarilla)
                    &&Fila5[i+2].getIcon().equals(fiAmarilla)&&Fila5[i+3].getIcon().equals(fiAmarilla)
                    ||Fila6[i].getIcon().equals(fiAmarilla)&&Fila6[i+1].getIcon().equals(fiAmarilla)
                    &&Fila6[i+2].getIcon().equals(fiAmarilla)&&Fila6[i+3].getIcon().equals(fiAmarilla)){
                      Anuncio.setText("¡¡Ganador!!  ");
                      imagen.setIcon(fiAmarilla);
                      Recetiar();
            }  if (Fila1[i].getIcon().equals(fiRojo)&&Fila1[i+1].getIcon().equals(fiRojo)
                    &&Fila1[i+2].getIcon().equals(fiRojo)&&Fila1[i+3].getIcon().equals(fiRojo)
                    ||Fila2[i].getIcon().equals(fiRojo)&&Fila2[i+1].getIcon().equals(fiRojo)
                    &&Fila2[i+2].getIcon().equals(fiRojo)&&Fila2[i+3].getIcon().equals(fiRojo)
                    ||Fila3[i].getIcon().equals(fiRojo)&&Fila3[i+1].getIcon().equals(fiRojo)
                    &&Fila3[i+2].getIcon().equals(fiRojo)&&Fila3[i+3].getIcon().equals(fiRojo)
                    ||Fila4[i].getIcon().equals(fiRojo)&&Fila4[i+1].getIcon().equals(fiRojo)
                    &&Fila4[i+2].getIcon().equals(fiRojo)&&Fila4[i+3].getIcon().equals(fiRojo)
                    ||Fila5[i].getIcon().equals(fiRojo)&&Fila5[i+1].getIcon().equals(fiRojo)
                    &&Fila5[i+2].getIcon().equals(fiRojo)&&Fila5[i+3].getIcon().equals(fiRojo)
                    ||Fila6[i].getIcon().equals(fiRojo)&&Fila6[i+1].getIcon().equals(fiRojo)
                    &&Fila6[i+2].getIcon().equals(fiRojo)&&Fila6[i+3].getIcon().equals(fiRojo)){
                      Anuncio.setText("¡¡Ganador!!  ");
                      imagen.setIcon(fiRojo);
                      Recetiar();
        }
      }
    }
    ////////Arreglos de las diagonales-Izquierda a Derecha////////
    JLabel diagonalA1[]={Coordenada_V1_3,Coordenada_V2_4,Coordenada_V3_5,Coordenada_V4_6};
    JLabel diagonalA2[]={Coordenada_V1_2,Coordenada_V2_3,Coordenada_V3_4,Coordenada_V4_5,Coordenada_V5_6};
    JLabel diagonalA3[]={Coordenada_V1_1,Coordenada_V2_2,Coordenada_V3_3,Coordenada_V4_4,Coordenada_V5_5,Coordenada_V6_6};
    JLabel diagonalA4[]={Coordenada_V2_1,Coordenada_V3_2,Coordenada_V4_3,Coordenada_V5_4,Coordenada_V6_5};
    JLabel diagonalA5[]={Coordenada_V3_1,Coordenada_V4_2,Coordenada_V5_3,Coordenada_V6_4};
    ////////Arreglos de las diagonales-Derecha a Izquierda////////
    JLabel diagonalB1[]={Coordenada_V6_3,Coordenada_V5_4,Coordenada_V4_5,Coordenada_V3_6};
    JLabel diagonalB2[]={Coordenada_V6_2,Coordenada_V5_3,Coordenada_V4_4,Coordenada_V3_5,Coordenada_V2_6};
    JLabel diagonalB3[]={Coordenada_V6_1,Coordenada_V5_2,Coordenada_V4_3,Coordenada_V3_4,Coordenada_V2_5,Coordenada_V1_6};
    JLabel diagonalB4[]={Coordenada_V5_1,Coordenada_V4_2,Coordenada_V3_3,Coordenada_V2_4,Coordenada_V1_5};
    JLabel diagonalB5[]={Coordenada_V4_1,Coordenada_V3_2,Coordenada_V2_3,Coordenada_V1_4};
    public void GanadorDiagolnalI_a_D() {
    for (int i = 0; i <= 2; i++) {
        for (int j = 0; j <= 1; j++) {
            if (diagonalA1[0].getIcon().equals(fiAmarilla) && diagonalA1[1].getIcon().equals(fiAmarilla)
                    && diagonalA1[2].getIcon().equals(fiAmarilla) && diagonalA1[3].getIcon().equals(fiAmarilla)
                    || diagonalA2[j].getIcon().equals(fiAmarilla) && diagonalA2[j+1].getIcon().equals(fiAmarilla)
                    && diagonalA2[j+2].getIcon().equals(fiAmarilla) && diagonalA2[j+3].getIcon().equals(fiAmarilla)
                    ||diagonalA3[i].getIcon().equals(fiAmarilla) && diagonalA3[i+1].getIcon().equals(fiAmarilla)
                    && diagonalA3[i+2].getIcon().equals(fiAmarilla) && diagonalA3[i+3].getIcon().equals(fiAmarilla)
                    || diagonalA4[j].getIcon().equals(fiAmarilla) && diagonalA4[j+1].getIcon().equals(fiAmarilla)
                    && diagonalA4[j+2].getIcon().equals(fiAmarilla) && diagonalA4[j+3].getIcon().equals(fiAmarilla)
                    ||diagonalA5[0].getIcon().equals(fiAmarilla) && diagonalA5[1].getIcon().equals(fiAmarilla)
                    && diagonalA5[2].getIcon().equals(fiAmarilla) && diagonalA5[3].getIcon().equals(fiAmarilla)) {
                      Anuncio.setText("¡¡Ganador!!  ");
                      imagen.setIcon(fiAmarilla);
                      Recetiar();
            }
            if (diagonalA1[0].getIcon().equals(fiRojo) && diagonalA1[1].getIcon().equals(fiRojo)
                    && diagonalA1[2].getIcon().equals(fiRojo) && diagonalA1[3].getIcon().equals(fiRojo)
                    || diagonalA2[j].getIcon().equals(fiRojo) && diagonalA2[j+1].getIcon().equals(fiRojo)
                    && diagonalA2[j+2].getIcon().equals(fiRojo) && diagonalA2[j+3].getIcon().equals(fiRojo)
                    ||diagonalA3[i].getIcon().equals(fiRojo) && diagonalA3[i+1].getIcon().equals(fiRojo)
                    && diagonalA3[i+2].getIcon().equals(fiRojo) && diagonalA3[i+3].getIcon().equals(fiRojo)
                    || diagonalA4[j].getIcon().equals(fiRojo) && diagonalA4[j+1].getIcon().equals(fiRojo)
                    && diagonalA4[j+2].getIcon().equals(fiRojo) && diagonalA4[j+3].getIcon().equals(fiRojo)
                    ||diagonalA5[0].getIcon().equals(fiRojo) && diagonalA5[1].getIcon().equals(fiRojo)
                    && diagonalA5[2].getIcon().equals(fiRojo) && diagonalA5[3].getIcon().equals(fiRojo)) {
                Anuncio.setText("¡¡Ganador!!  ");
                imagen.setIcon(fiRojo);
                Recetiar();
            }
        }
    }
    }
    public void GanadorDiagolnalDer_a_Izq() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                if (diagonalB1[0].getIcon().equals(fiAmarilla) && diagonalB1[1].getIcon().equals(fiAmarilla)
                        && diagonalB1[2].getIcon().equals(fiAmarilla) && diagonalB1[3].getIcon().equals(fiAmarilla)
                        || diagonalB2[j].getIcon().equals(fiAmarilla) && diagonalB2[j+1].getIcon().equals(fiAmarilla)
                        && diagonalB2[j+2].getIcon().equals(fiAmarilla) && diagonalB2[j+3].getIcon().equals(fiAmarilla)
                        ||diagonalB3[i].getIcon().equals(fiAmarilla) && diagonalB3[i+1].getIcon().equals(fiAmarilla)
                        && diagonalB3[i+2].getIcon().equals(fiAmarilla) && diagonalB3[i+3].getIcon().equals(fiAmarilla)
                        || diagonalB4[j].getIcon().equals(fiAmarilla) && diagonalB4[j+1].getIcon().equals(fiAmarilla)
                        && diagonalB4[j+2].getIcon().equals(fiAmarilla) && diagonalB4[j+3].getIcon().equals(fiAmarilla)
                        ||diagonalB5[0].getIcon().equals(fiAmarilla) && diagonalB5[1].getIcon().equals(fiAmarilla)
                        && diagonalB5[2].getIcon().equals(fiAmarilla) && diagonalB5[3].getIcon().equals(fiAmarilla)) {
                    Anuncio.setText("¡¡Ganador!!  ");
                    imagen.setIcon(fiAmarilla);
                    Recetiar();
                }
                if (diagonalB1[0].getIcon().equals(fiRojo) && diagonalB1[1].getIcon().equals(fiRojo)
                        && diagonalB1[2].getIcon().equals(fiRojo) && diagonalB1[3].getIcon().equals(fiRojo)
                        || diagonalB2[j].getIcon().equals(fiRojo) && diagonalB2[j+1].getIcon().equals(fiRojo)
                        && diagonalB2[j+2].getIcon().equals(fiRojo) && diagonalB2[j+3].getIcon().equals(fiRojo)
                        ||diagonalB3[i].getIcon().equals(fiRojo) && diagonalB3[i+1].getIcon().equals(fiRojo)
                        && diagonalB3[i+2].getIcon().equals(fiRojo) && diagonalB3[i+3].getIcon().equals(fiRojo)
                        || diagonalB4[j].getIcon().equals(fiRojo) && diagonalB4[j+1].getIcon().equals(fiRojo)
                        && diagonalB4[j+2].getIcon().equals(fiRojo) && diagonalB4[j+3].getIcon().equals(fiRojo)
                        ||diagonalB5[0].getIcon().equals(fiRojo) && diagonalB5[1].getIcon().equals(fiRojo)
                        && diagonalB5[2].getIcon().equals(fiRojo) && diagonalB5[3].getIcon().equals(fiRojo)) {
                    Anuncio.setText("¡¡Ganador!!  ");
                    imagen.setIcon(fiRojo);
                    Recetiar();
                }
            }
        }
    }
    public void Recetiar(){
        for(int i=0;i<6;i++){
            Columna1[i].setIcon(fiVacia);
            Columna2[i].setIcon(fiVacia);
            Columna3[i].setIcon(fiVacia);
            Columna4[i].setIcon(fiVacia);
            Columna5[i].setIcon(fiVacia);
            Columna6[i].setIcon(fiVacia);
             i1=0;
             i2=0;
             i3=0;
             i4=0;
             i5=0;
             i6=0;
        }
        retraso();
    }
    public void Tiempo(){
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                //codigo a ejecutar al terminar el tiempo
               Recetiar();
            }
        };
        // Aquí se pone en marcha el timer cada segundo.
        java.util.Timer timer = new Timer();
        //300s=5m    300,000=5min                   1m
        timer.scheduleAtFixedRate(timerTask, 5000, 1000);
    }
    public void retraso() {
        for (int a = 4; a > 0; a--) {
            System.out.println(a);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tablero");
        frame.setContentPane(new Tablero().panel_p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setBounds(400,100,500,500);

    }

}
