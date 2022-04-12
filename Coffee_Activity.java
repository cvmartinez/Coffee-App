package com.ranamuneeb.coffee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Coffee_Activity extends AppCompatActivity {
    private TextView tvtitle, tvdescription, tvcategory;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_);

        tvtitle = (TextView) findViewById(R.id.txtitle);
        tvdescription = (TextView) findViewById(R.id.textDesc);
        tvcategory = (TextView) findViewById(R.id.txtCat);
        img = (ImageView) findViewById(R.id.coffeethumbnail);

        //Recieve Data
        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        String Title = intent.getExtras().getString("title");
        String Description = intent.getExtras (). getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        if(name!=null) {
            //Setting values
            if (name.equalsIgnoreCase("Ice Latte")) {
                Title = name;
                image = R.drawable.caffelatte;
                Description = "\tThe latte is one of the most iconic espresso drinks, favored for its frothy foam topping. In this refreshing iced version, you can easily create foam with cold milk—no steamer needed. \n" +
                        "o\tIngredients\n" +
                        "\uF0A7\t1 cup ice\n" +
                        "\uF0A7\t4 oz espresso, such as Starbucks® Espresso Roast\n" +
                        "\uF0A7\t¾ cup whole milk\n" +
                        "\uF0A7\tsweetener of choice, such as vanilla or classic syrup (optional)\n";
            } else if (name.equalsIgnoreCase("Ice Macchiato")) {
                Title = name;
                image = R.drawable.macchiato;
                Description = "\tThis macchiato drink tastes like coffee, with a lot of milk. The strong espresso and eight ounces of milk balance each other into a pleasant and creamy, tasting drink. The Iced Caramel Macchiato has a nice mouthfeel, but it is sweet. You can always cut the sweetness by adding less of the vanilla and caramel syrup. It’s the perfect afternoon pick-me-up if you love iced coffee.\n" +
                        "\n" +
                        "o\tIngredients\n" +
                        "\uF0A7\tvanilla syrup\n" +
                        "\uF0A7\tmilk\n" +
                        "\uF0A7\tespresso\n" +
                        "\uF0A7\tcaramel sauce\n" +
                        "\uF0A7\tice\n";
            } else if (name.equalsIgnoreCase("Cold Brew")) {
                Title = name;
                image = R.drawable.caffelatte;
                Description = "\tCold brew can be strong.\n" +
                        "\uF0A7\tThis depends on a lot of factors, including the beans used, steeping time, and dilution. The dilution is the factor that is the easiest to control. Don’t drink cold brew concentrate straight—it’s for sure very high in caffeine!\n" +
                        "o\t Cold brew is less acidic.\n" +
                        "\uF0A7\tIf regular drip coffee or espresso upsets your stomach, cold brew might not. The only way to know is to try it, and you’ll have more control over the end result if you make it yourself.\n" +
                        "o\tIngredients\n" +
                        "\uF0A7\t3 ounces coarsely-ground coffee (that’s about ¾ cup whole coffee beans turned into about 1 ½ cups coarsely-ground coffee)\n" +
                        "\uF0A7\t3 cups water (filtered water if you have it)\n";
            } else if (name.equalsIgnoreCase("Latte")) {
                Title = name;
                image = R.drawable.caffelatte;
                Description = "\t Latte -- also referred to as Caffe Latte , which is an Italian term that means \"milk coffee\" -- is all about having a smooth, silky micro foam.\n" +
                        "o\tThe texture of the foam on a latte is very important and is what gives this coffee drink its distinct look and mouthfeel.\n";

            } else if (name.equalsIgnoreCase("Cappuccino")) {
                Title = name;
                image = R.drawable.cappuccino;
                Description = "o\tCappuccino is a classic drink from Italy that is known for its frothy top. Lovers of coffee art often order a cappuccino because their foam typically has the most elaborate designs swirled on top.\n" +
                        "o\tCappuccino is known for being milky, yet the espresso definitely doesn't go unnoticed. However, those who prefer more milk than coffee often appreciate the flavor and mouth feel of this drink. The foam portion of a cappuccino can either be velvety or dry.\n" +
                        "\n" +
                        "o\tThe milk to coffee ratio of the cappuccino is:\n" +
                        "\uF0A7\t1/3 Espresso\n" +
                        "\uF0A7\t1/3 Steamed Milk\n" +
                        "\uF0A7\t1/3 Milk Foam\n";
            } else if (name.equalsIgnoreCase("Macchiato")) {
                Title = name;
                image = R.drawable.macchiato;
                Description = "\tThe Macchiato, also known as the Caffe Macchiato or Espresso Macchiato, has a bolder flavor than many other coffee drinks. It's comprised of a small amount of milk with a lot of espresso. Rather than thinking of ratios, it's easier to view the macchiato as an espresso with a spot of milk in it. In fact, the word \"macchiato\" means \"spotted\" in Italian.\n" +
                        "o\tMacchiato can have foam on it, but it's usually a small layer of micro foam to allow the taste of the espresso to shine. Using high quality espresso beans in macchiato is essential, as it's the primary flavor of the drink.\n";

            } else if (name.equalsIgnoreCase("Drip Coffee")) {
                Title = name;
                image = R.drawable.caffelatte;
                Description = "\tThe ritual of the pour over is like a meditation: There’s no machine in your way, no flashing green lights, no electric power cords. Just you and a few simple tools. The final cup is reminiscent of one from a drip coffeemaker, but noticeably more delicate and complex. Observe the bloom, experience the first trace of coffee-drunk steam, notice how the spiral of the pour alters the final cup. This simple experience gets you in tune with your coffee.\n" +
                        "o\tIngredients \n" +
                        "\uF0A7\tBeans\n" +
                        "\uF0A7\tWater\n";
            }
            tvtitle.setText(Title);
            tvdescription.setText(Description);
            img.setImageResource(image);
        }
    }
}
