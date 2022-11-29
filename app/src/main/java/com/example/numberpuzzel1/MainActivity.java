package com.example.numberpuzzel1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b[]=new Button[9];
    String a[] =new String[9];
    int i;
    Button s1;
    TextView t;

    ArrayList<Integer> arrayList=new ArrayList<>();
    //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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = findViewById(R.id.s1);
        t = findViewById(R.id.t);

        for(int i=0;i<9;i++)
        {
            while(true)
            {
                int min=0;
                int max=9;

                    int r = new Random().nextInt(max-min)+min;

                    if(!arrayList.contains(r))
                    {
                        arrayList.add(r);
                        break;
                    }
            }
        }
        for(i=0;i<b.length;i++)
        {
            int id =getResources().getIdentifier("b"+i,"id",getPackageName());
            b[i]=findViewById(id);
                if(arrayList.get(i)==0)
                {
                    b[i].setText("");
                }
                else
                {
                    b[i].setText(""+arrayList.get(i));
                }
                b[i].setOnClickListener(this);
        }

    }





    @Override
    public void onClick(View v) {
        for (int i = 0; i < b.length; i++)
        {
            if (v.getId() == b[i].getId())
            {
                if (i == 0)
                {
                    String bt1 = b[i].getText().toString();
                    if (b[1].getText().equals(""))
                    {

                        b[1].setText(bt1);
                        b[0].setText("");
                    }
                    if (b[3].getText().equals(""))
                    {
                        b[3].setText(bt1);
                        b[0].setText("");
                    }
                    win();
                }
                if (i == 1)
                {
                    String bt1 = b[i].getText().toString();
                    if (b[0].getText().equals(""))
                    {
                        b[0].setText(bt1);
                        b[1].setText("");
                    }
                    if (b[2].getText().equals(""))
                    {
                        b[2].setText(bt1);
                        b[1].setText("");
                    }
                    if (b[4].getText().equals(""))
                    {
                        b[4].setText(bt1);
                        b[1].setText("");
                    }
                    win();
                }
                if (i == 2) {
                    String bt1 = b[i].getText().toString();
                    if (b[1].getText().equals(""))
                    {
                        b[1].setText(bt1);
                        b[2].setText("");
                    }
                    if (b[5].getText().equals(""))
                    {
                        b[5].setText(bt1);
                        b[2].setText("");
                    }
                    win();
                }
                if (i == 3)
                {
                    String bt1 = b[i].getText().toString();
                    if (b[0].getText().equals(""))
                    {
                        b[0].setText(bt1);
                        b[3].setText("");
                    }
                    if (b[4].getText().equals(""))
                    {
                        b[4].setText(bt1);
                        b[3].setText("");
                    }
                    if (b[6].getText().equals(""))
                    {
                        b[6].setText(bt1);
                        b[3].setText("");
                    }
                    win();
                }
                if (i == 4)
                {
                    String bt1 = b[i].getText().toString();
                    if (b[1].getText().equals(""))
                    {
                        b[1].setText(bt1);
                        b[4].setText("");
                    }
                    if (b[3].getText().equals(""))
                    {
                        b[3].setText(bt1);
                        b[4].setText("");
                    }
                    if (b[5].getText().equals(""))
                    {
                        b[5].setText(bt1);
                        b[4].setText("");
                    }
                    if (b[7].getText().equals("")) {
                        b[7].setText(bt1);
                        b[4].setText("");
                    }
                    win();
                }
                if (i == 5)
                {
                    String bt1 = b[i].getText().toString();
                    if (b[2].getText().equals(""))
                    {
                        b[2].setText(bt1);
                        b[5].setText("");
                    }
                    if (b[4].getText().equals(""))
                    {
                        b[4].setText(bt1);
                        b[5].setText("");
                    }
                    if (b[8].getText().equals(""))
                    {
                        b[8].setText(bt1);
                        b[5].setText("");
                    }
                    win();
                }
                if (i == 6)
                {
                    String bt1 = b[i].getText().toString();
                    if (b[3].getText().equals(""))
                    {
                        b[3].setText(bt1);
                        b[6].setText("");
                    }
                    if (b[7].getText().equals(""))
                    {
                        b[7].setText(bt1);
                        b[6].setText("");
                    }
                    win();
                }
                if (i == 7)
                {
                    String bt1 = b[i].getText().toString();
                    if (b[4].getText().equals(""))
                    {
                        b[4].setText(bt1);
                        b[7].setText("");
                    }
                    if (b[6].getText().equals(""))
                    {
                        b[6].setText(bt1);
                        b[7].setText("");
                    }
                    if (b[8].getText().equals(""))
                    {
                        b[8].setText(bt1);
                        b[7].setText("");
                    }
                    win();
                }
                if (i == 8)
                {
                    String bt1 = b[i].getText().toString();
                    if (b[5].getText().equals(""))
                    {
                        b[5].setText(bt1);
                        b[8].setText("");
                    }
                    if (b[7].getText().equals(""))
                    {
                        b[7].setText(bt1);
                        b[8].setText("");
                    }
                    win();
                }

                s1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {

                        t.setText("");
                        arrayList.clear();

                        for (int i = 0; i < 9; i++)
                        {
                            while (true)
                            {
                                int max = 9;
                                int min = 0;
                                int r = new Random().nextInt(max - min) + min;

                                if (!arrayList.contains(r))
                                {
                                    arrayList.add(r);
                                    break;
                                }

                            }
                            if (arrayList.get(i) == 0)
                            {
                                b[i].setText("");
                            }
                            else
                            {
                                b[i].setText(""+ arrayList.get(i));
                            }
                        }

                    }

                });
            }
        }
    }
    void win()
    {

                for (int i = 0; i < 9; i++)
                {
                    a[i]=b[i].getText().toString();
                }

                if(a[0].equals("1") && a[1].equals("2") && a[2].equals("3") && a[3].equals("4") && a[4].equals("5") && a[5].equals("6") && a[6].equals("7") && a[7].equals("8") && a[8].equals(""))
                {

                    t.setText("You have Solve the Puzzle");

                    for (int i = 0; i < b.length; i++)
                    {
                        b[i].setEnabled(false);

                    }
            }
    }
}

