package com.example.claculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one1,two2,three3,four4,five5,six6,seven7,eight8,nine9,zero0,
            dot,clear,percent1,divide,multiply1,subtract,addition,equal,cut;
    TextView displayNum,displayNumSmall;
    //background String
    StringBuffer sb = new StringBuffer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for hiding the title bar
        getSupportActionBar().hide();

        initView();
        initListener();

    }

    private void initListener() {
        //button Listeners
        one1.setOnClickListener(this);
        two2.setOnClickListener(this);
        three3.setOnClickListener(this);
        four4.setOnClickListener(this);
        five5.setOnClickListener(this);
        six6.setOnClickListener(this);
        seven7.setOnClickListener(this);
        eight8.setOnClickListener(this);
        nine9.setOnClickListener(this);
        zero0.setOnClickListener(this);

        dot.setOnClickListener(this);
        clear.setOnClickListener(this);
        percent1.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply1.setOnClickListener(this);
        subtract.setOnClickListener(this);
        addition.setOnClickListener(this);
        equal.setOnClickListener(this);
        cut.setOnClickListener(this);
    }

    private void initView() {
        //TextView id object
        displayNum=findViewById(R.id.displayNum);
        displayNumSmall=findViewById(R.id.displayNumSmall);

        //this for number
        one1 = findViewById(R.id.one1);
        two2=findViewById(R.id.two2);
        three3=findViewById(R.id.three3);
        four4=findViewById(R.id.four4);
        five5=findViewById(R.id.five5);
        six6=findViewById(R.id.six6);
        seven7=findViewById(R.id.seven7);
        eight8=findViewById(R.id.eight8);
        nine9=findViewById(R.id.nine9);
        zero0=findViewById(R.id.zero0);

        //this for operation
        dot=findViewById(R.id.dot);
        clear=findViewById(R.id.clear);
        percent1=findViewById(R.id.percent1);
        divide=findViewById(R.id.divide);
        multiply1=findViewById(R.id.multiply1);
        subtract=findViewById(R.id.subtract);
        addition=findViewById(R.id.addition);
        equal=findViewById(R.id.equal);
        cut=findViewById(R.id.cut);
    }

    @Override
    public void onClick(View view) {
        //for numbers button
        buttonPress(view);
    }


    //button press method
    private void buttonPress(View view){
        if (view == one1) {
            sb.append("1");
            displayNum.setText(displayNum.getText().toString() + "1");
        }
        if (view == two2) {
            sb.append("2");
            displayNum.setText(displayNum.getText().toString()+"2");
        }
        if (view == three3) {
            sb.append("3");
            displayNum.setText(displayNum.getText().toString()+"3");
        }
        if (view == four4) {
            sb.append("4");
            displayNum.setText(displayNum.getText().toString()+"4");
        }
        if (view == five5) {
            sb.append("5");
            displayNum.setText(displayNum.getText().toString()+"5");
        }
        if (view == six6) {
            sb.append("6");
            displayNum.setText(displayNum.getText().toString()+"6");
        }
        if (view == seven7) {
            sb.append("7");
            displayNum.setText(displayNum.getText().toString()+"7");
        }
        if (view == eight8) {
            sb.append("8");
            displayNum.setText(displayNum.getText().toString()+"8");
        }
        if (view == nine9) {
            sb.append("9");
            displayNum.setText(displayNum.getText().toString()+"9");
        }
        if (view == zero0) {
            sb.append("0");
            displayNum.setText(displayNum.getText().toString()+"0");
        }

        //for operation
        if (view == dot) {
            sb.append(".");
            displayNum.setText(displayNum.getText().toString()+".");
        }
        if (view == clear) {
            sb.delete(0,sb.length());
            displayNum.setText("");
            displayNumSmall.setText("");
        }
        if (view == percent1) {
            if (forChacking()) {
                StringBuffer sb1 = new StringBuffer();
                sb1.append(displayNum.getText().toString());
                sb1.deleteCharAt(sb1.length() - 1);
                displayNum.setText(sb1);
                sb.deleteCharAt(sb.length() - 1);
                sb.append("%");
                displayNum.setText(displayNum.getText().toString() + "%");
            }
            else {
                sb.append("%");
                displayNum.setText(displayNum.getText().toString() + "%");
            }
        }
        if (view == divide) {
            if (forChacking()) {
                StringBuffer sb1 = new StringBuffer();
                sb1.append(displayNum.getText().toString());
                sb1.deleteCharAt(sb1.length() - 1);
                displayNum.setText(sb1);
                sb.deleteCharAt(sb.length() - 1);
                sb.append("/");
                displayNum.setText(displayNum.getText().toString() + "÷");
            }
            else {
                sb.append("/");
                displayNum.setText(displayNum.getText().toString() + "÷");
            }
        }
        if (view == multiply1) {
            if (forChacking()) {
                StringBuffer sb1 = new StringBuffer();
                sb1.append(displayNum.getText().toString());
                sb1.deleteCharAt(sb1.length() - 1);
                displayNum.setText(sb1);
                sb.deleteCharAt(sb.length() - 1);
                sb.append("*");
                displayNum.setText(displayNum.getText().toString() + "×");
            }
            else {
                sb.append("*");
                displayNum.setText(displayNum.getText().toString() + "×");
            }
        }
        if (view == subtract) {
            if (forChacking()) {
                StringBuffer sb1 = new StringBuffer();
                sb1.append(displayNum.getText().toString());
                sb1.deleteCharAt(sb1.length() - 1);
                displayNum.setText(sb1);
                sb.deleteCharAt(sb.length() - 1);
                sb.append("-");
                displayNum.setText(displayNum.getText().toString() + "-");
            }
            else {
                sb.append("-");
                displayNum.setText(displayNum.getText().toString() + "-");
            }
        }
        if (view == addition) {
            if (forChacking()) {
                StringBuffer sb1 = new StringBuffer();
                sb1.append(displayNum.getText().toString());
                sb1.deleteCharAt(sb1.length() - 1);
                displayNum.setText(sb1);
                sb.deleteCharAt(sb.length() - 1);
                sb.append("+");
                displayNum.setText(displayNum.getText().toString() + "+");
            }
            else {
                sb.append("+");
                displayNum.setText(displayNum.getText().toString() + "+");
            }
        }
        if (view == equal) {
            equalMethod();
        }
        if (view == cut) {
            if(displayNum.getText().length() != 0) {
                StringBuffer sb1 = new StringBuffer();
                sb1.append(displayNum.getText().toString());
                sb1.deleteCharAt(sb1.length() - 1);
                displayNum.setText(sb1);
                //edit background String
                sb.deleteCharAt(sb.length() - 1);

            }
        }
    }

    private Boolean forChacking(){
        if(sb.toString().contains("+")|sb.toString().contains("-")|
                sb.toString().contains("*")|sb.toString().contains("/")|sb.toString().contains("%")){
            return true;
        }
        return false;
    }

    //operation methods 1
    private String divideFun(){
        String [] value1 = sb.toString().split("/");
        int value2 = Integer.parseInt(value1[0]);
        for(int i = 1;i<=value1.length-1;i++) {
            if(Integer.parseInt(value1[i]) == 0){
                displayNum.setText("Cannot be divided by 0");
                break;
            }
            else {
                value2 = value2 / Integer.parseInt(value1[i]);
                Integer ans = value2;
                sb.delete(0,sb.length());
                sb.append(ans.toString());
                return ans.toString();
            }
        }
        return "";
    }
    //operation methods 2
    private String multi(){
        String [] value1 = sb.toString().split("\\*");
        int value2 = Integer.parseInt(value1[0]);
        for(int i = 1;i<=value1.length-1;i++) {
            value2 = value2 * Integer.parseInt(value1[i]);
        }
        Integer ans = value2;
        sb.delete(0,sb.length());
        sb.append(ans.toString());
        return ans.toString();
    }
    //operation methods 3
    private String subtract1(){
        String [] value1 = sb.toString().split("-");
        int value2 = 0;
        for(int i = 0;i<=value1.length-1;i++) {
            value2 = Integer.parseInt(value1[i]) - value2;
        }
        Integer ans = value2-value2-value2;
        sb.delete(0,sb.length());
        sb.append(ans.toString());
        return ans.toString();
    }
    //operation methods 4
    private String addition1(){
        String [] value1 = sb.toString().split("\\+");
        int value2 = 0;
        for(int i = 0;i<=value1.length-1;i++) {
            value2 = value2 + Integer.parseInt(value1[i]);
        }
        Integer ans = value2;
        sb.delete(0,sb.length());
        sb.append(ans.toString());
        return ans.toString();
    }
//    private String percentMethod(){
////        String [] value1 = sb.toString().split("%");
////        int value2 = 0;
////        for(int i = 0;i<=value1.length-1;i++) {
////            value2 = value2 + Integer.parseInt(value1[i]);
////        }
////        Integer ans = value2;
////        sb.delete(0,sb.length());
////        sb.append(ans.toString());
////        return ans.toString();
//    }
    //operation methods 5
    private void equalMethod(){
        if(sb.toString().contains("+")){
            String additionValue = addition1();
            displayNumSmall.setText(additionValue);
        }


        if(sb.toString().contains("-")){
            String subtractValue = subtract1();
            displayNumSmall.setText(subtractValue);
        }


        if(sb.toString().contains("*")){
            String multip = multi();
            displayNumSmall.setText(multip);
        }

        if(sb.toString().contains("/")){
            String divideRe = divideFun();
            displayNumSmall.setText(divideRe);
        }
//        if(sb.toString().contains("%")){
//            String percentRe = percentMethod();
//            displayNumSmall.setText(percentRe);
//        }
    }
}