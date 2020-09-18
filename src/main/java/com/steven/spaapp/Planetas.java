package com.steven.spaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Planetas extends AppCompatActivity {


    TextView Informacion;
    ImageView Mercury, Venus, Tierra, Marte, Jupiter, Saturno, Urano, Neptuno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetas);



        Intent Planet = getIntent();
        String Seleccion = Planet.getStringExtra("planeta");
        Informacion = (TextView)findViewById(R.id.txtInfoPlaneta);
        Mercury = (ImageView)findViewById(R.id.mercury);
        Venus = (ImageView)findViewById(R.id.venus);
        Tierra = (ImageView)findViewById(R.id.tierra);
        Marte = (ImageView)findViewById(R.id.marte);
        Jupiter = (ImageView)findViewById(R.id.jupiter);
        Saturno = (ImageView)findViewById(R.id.saturno);
        Urano = (ImageView)findViewById(R.id.urano);
        Neptuno = (ImageView)findViewById(R.id.neptuno);

        switch (Seleccion) {

            case "Mercurio":
                Informacion.setText("Es el primer planeta, es un planeta estéril. Es el planeta mas pequeño del sistema solar. " +
                        "Tarda 88 días en dar una vuelta completa alrededor del Sol.");
                Mercury.setVisibility(View.VISIBLE);
                Venus.setVisibility(View.GONE);
                Tierra.setVisibility(View.GONE);
                Marte.setVisibility(View.GONE);
                Jupiter.setVisibility(View.GONE);
                Saturno.setVisibility(View.GONE);
                Urano.setVisibility(View.GONE);
                Neptuno.setVisibility(View.GONE);
                break;

            case "Venus":
                Informacion.setText("El segundo planeta más cercano al Sol, pero el más caliente ya que los gases de su atmósfera " +
                        "casi no dejan escapar el calor. Es más pequeño que la Tierra, y tarda unos 225 días en terminar una " +
                        "órbita alrededor del sol. A diferencía de los demás planetas, venus orbita en dirección contraría a la usual.");
                Mercury.setVisibility(View.GONE);
                Venus.setVisibility(View.VISIBLE);
                Tierra.setVisibility(View.GONE);
                Marte.setVisibility(View.GONE);
                Jupiter.setVisibility(View.GONE);
                Saturno.setVisibility(View.GONE);
                Urano.setVisibility(View.GONE);
                Neptuno.setVisibility(View.GONE);
                break;

            case "Tierra":
                Informacion.setText("Es el tercer planeta en orden de cercanía al Sol, y tú lo conoces. Hasta ahora, " +
                        "es el único planeta que conocemos capaz de acoger vida. Se formó poco después de que comenzó " +
                        "a formarse el Sol, hace unos 4.5 miles de millones de años.");
                Mercury.setVisibility(View.GONE);
                Venus.setVisibility(View.GONE);
                Tierra.setVisibility(View.VISIBLE);
                Marte.setVisibility(View.GONE);
                Jupiter.setVisibility(View.GONE);
                Saturno.setVisibility(View.GONE);
                Urano.setVisibility(View.GONE);
                Neptuno.setVisibility(View.GONE);
                break;

            case "Marte":
                Informacion.setText("Algunas personas lo llaman “planeta rojo”, porque su superficie tiene óxido de hierro, " +
                        "un material de color rojizo. Al igual que los tres planetas anteriores, su suelo es de roca sólida. " +
                        "Actualmente, los científicos se han interesado en Marte porque creen que pudo o podría albergar vida, " +
                        "incluso esperan que en años futuros algunas personas vayan a vivir ahí.");
                Mercury.setVisibility(View.GONE);
                Venus.setVisibility(View.GONE);
                Tierra.setVisibility(View.GONE);
                Marte.setVisibility(View.VISIBLE);
                Jupiter.setVisibility(View.GONE);
                Saturno.setVisibility(View.GONE);
                Urano.setVisibility(View.GONE);
                Neptuno.setVisibility(View.GONE);
                break;

            case "Jupiter":
                Informacion.setText("Jupiter es el planeta más grande del Sistema Solar. Es una enorme bola de gas, " +
                        "la gran mancha roja, una tormenta que parece un remolino, es incluso más grande que la Tierra, " +
                        "esta tormenta tiene mas de 300 años. Ademas Jupiter posee la luna mas grande del sistema solar, " +
                        "llamada Ganimedes, que es incluso mas grande que Mercurio.");
                Mercury.setVisibility(View.GONE);
                Venus.setVisibility(View.GONE);
                Tierra.setVisibility(View.GONE);
                Marte.setVisibility(View.GONE);
                Jupiter.setVisibility(View.VISIBLE);
                Saturno.setVisibility(View.GONE);
                Urano.setVisibility(View.GONE);
                Neptuno.setVisibility(View.GONE);
                break;

            case "Saturno":
                Informacion.setText("Saturno es el segundo planeta mas grande del sistema solar, es otro gigante de gas como " +
                        "Jupiter, pero es mejor conocida por tener un impresionante conjunto de anillos compuestos por " +
                        "millones de pedacitos de hielo. Es el sexto más cercano al Sol, y ademas es el planeta con mas " +
                        "lunas en el sistema solar.");
                Mercury.setVisibility(View.GONE);
                Venus.setVisibility(View.GONE);
                Tierra.setVisibility(View.GONE);
                Marte.setVisibility(View.GONE);
                Jupiter.setVisibility(View.GONE);
                Saturno.setVisibility(View.VISIBLE);
                Urano.setVisibility(View.GONE);
                Neptuno.setVisibility(View.GONE);
                break;

            case "Urano":
                Informacion.setText("Tiene unos anillos delgados, pero no son tan visibles como los de Saturno. Es un planeta" +
                        " que se ve de color azul verdoso porque tiene un gas llamado metano.  Gira sobre sí mismo como pero " +
                        "de una forma peculiar: en vez de hacerlo de forma similar a la de la Tierra, lo hace de costado.");
                Mercury.setVisibility(View.GONE);
                Venus.setVisibility(View.GONE);
                Tierra.setVisibility(View.GONE);
                Marte.setVisibility(View.GONE);
                Jupiter.setVisibility(View.GONE);
                Saturno.setVisibility(View.GONE);
                Urano.setVisibility(View.VISIBLE);
                Neptuno.setVisibility(View.GONE);
                break;

            case "Neptuno":
                Informacion.setText("El gigante gaseoso más pequeño y el más lejano del Sol. Tiene vientos sumamente fuertes y " +
                        "tarda 165 años en completar su órbita. Apenas en 2011 terminó su recorrido alrededor del Sol " +
                        "desde que fue descubierto en 1846.");
                Mercury.setVisibility(View.GONE);
                Venus.setVisibility(View.GONE);
                Tierra.setVisibility(View.GONE);
                Marte.setVisibility(View.GONE);
                Jupiter.setVisibility(View.GONE);
                Saturno.setVisibility(View.GONE);
                Urano.setVisibility(View.GONE);
                Neptuno.setVisibility(View.VISIBLE);
                break;
        }

    }
}
