package com.example.cake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ingredient[] ingredients ={ //массив ингридиентов
                new Ingredient("Бисквитные коржи",10,26),//переменные
                new Ingredient("Сливки",14,5),
                new Ingredient("Фрукты",3,12),
                new Ingredient("Орехи",5,55),
                new Ingredient("Ягоды",7,0),
        };

        int totalMoney = 45; //все деньги

        boolean canAfford = checkItAffrod(ingredients,totalMoney); //проверка на возможность покупки

        TextView resultTextView = findViewById(R.id.resultTextView);

        if(canAfford){ // если могу купить
            resultTextView.setText("Средств хватит на покупку ингридиентов"); //вывод на resultTextView
        }
        else {// иначе
            resultTextView.setText("Средств недостаточно");
        }



    }
 private boolean checkItAffrod(Ingredient[] ingredients, int totalMoney){
      int requiedMoney = 0;
      for (Ingredient ingredient : ingredients)
          requiedMoney += ingredient.getDiscountPrice();

        return totalMoney >= requiedMoney; // денег больше или равно запрашиваемым деньгам
 }
}

