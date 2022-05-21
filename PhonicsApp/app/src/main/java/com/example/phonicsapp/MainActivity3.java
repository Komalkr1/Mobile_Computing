package com.example.phonicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z,attemptBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        attemptBtn=findViewById(R.id.Attempt);
        attemptBtn.setOnClickListener(this);

        a = findViewById(R.id.a);
        a.setOnClickListener(this);

        b = findViewById(R.id.b);
        b.setOnClickListener(this);

        c = findViewById(R.id.c);
        c.setOnClickListener(this);

        d = findViewById(R.id.d);
        d.setOnClickListener(this);

        e = findViewById(R.id.e);
        e.setOnClickListener(this);

        f = findViewById(R.id.f);
        f.setOnClickListener(this);

        g = findViewById(R.id.g);
        g.setOnClickListener(this);

        h = findViewById(R.id.h);
        h.setOnClickListener(this);

        i = findViewById(R.id.i);
        i.setOnClickListener(this);

        j = findViewById(R.id.j);
        j.setOnClickListener(this);

        k = findViewById(R.id.k);
        k.setOnClickListener(this);

        l = findViewById(R.id.l);
        l.setOnClickListener(this);

        m = findViewById(R.id.m);
        m.setOnClickListener(this);

        n = findViewById(R.id.n);
        n.setOnClickListener(this);

        o = findViewById(R.id.o);
        o.setOnClickListener(this);

        p = findViewById(R.id.p);
        p.setOnClickListener(this);

        q = findViewById(R.id.q);
        q.setOnClickListener(this);

        r = findViewById(R.id.r);
        r.setOnClickListener(this);

        s = findViewById(R.id.s);
        s.setOnClickListener(this);

        t = findViewById(R.id.t);
        t.setOnClickListener(this);

        u = findViewById(R.id.u);
        u.setOnClickListener(this);

        v = findViewById(R.id.v);
        v.setOnClickListener(this);

        w = findViewById(R.id.w);
        w.setOnClickListener(this);

        x = findViewById(R.id.x);
        x.setOnClickListener(this);

        y = findViewById(R.id.y);
        y.setOnClickListener(this);

        z = findViewById(R.id.z);
        z.setOnClickListener(this);
    }

    @Override

    public void onClick(View v) {

        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        switch (v.getId()) {

            case R.id.Attempt:
                intent = new Intent(MainActivity3.this, MainActivity4.class);
                break;
            case R.id.a:
                intent.putExtra("input", "a");
                break;
            case R.id.b:
                intent.putExtra("input", "b");
                break;
            case R.id.c:
                intent.putExtra("input", "c");
                break;
            case R.id.d:
                intent.putExtra("input", "d");
                break;
            case R.id.e:
                intent.putExtra("input", "e");
                break;
            case R.id.f:
                intent.putExtra("input", "f");
                break;
            case R.id.g:
                intent.putExtra("input", "g");
                break;
            case R.id.h:
                intent.putExtra("input", "h");
                break;
            case R.id.i:
                intent.putExtra("input", "i");
                break;
            case R.id.j:
                intent.putExtra("input", "j");
                break;
            case R.id.k:
                intent.putExtra("input", "k");
                break;
            case R.id.l:
                intent.putExtra("input", "l");
                break;
            case R.id.m:
                intent.putExtra("input", "m");
                break;
            case R.id.n:
                intent.putExtra("input", "n");
                break;
            case R.id.o:
                intent.putExtra("input", "o");
                break;
            case R.id.p:
                intent.putExtra("input", "p");
                break;
            case R.id.q:
                intent.putExtra("input", "q");
                break;
            case R.id.r:
                intent.putExtra("input", "r");
                break;
            case R.id.s:
                intent.putExtra("input", "s");
                break;
            case R.id.t:
                intent.putExtra("input", "t");
                break;
            case R.id.u:
                intent.putExtra("input", "u");
                break;
            case R.id.v:
                intent.putExtra("input", "v");
                break;
            case R.id.w:
                intent.putExtra("input", "w");
                break;
            case R.id.x:
                intent.putExtra("input", "x");
                break;
            case R.id.y:
                intent.putExtra("input", "y");
                break;
            default:
                intent.putExtra("input", "z");
        }
        startActivity(intent);
    }
}