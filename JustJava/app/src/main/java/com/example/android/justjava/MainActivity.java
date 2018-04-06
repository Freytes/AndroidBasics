/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * This is the global variable used to
     * remember cups of coffee
     */
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //Figure out if user wants whipped cream
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        //Figure out if user wants chocolate
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        //Find users name
        EditText nameField = (EditText) findViewById(R.id.name);
        String name = nameField.getText().toString();

        //Calculate Price
        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String priceMessage = createOrderSummary(name, price, hasWhippedCream, hasChocolate);

        //Creates an email with Order Summary
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java order for " + name);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * This method calculates the price of the order
     *
     * @return total price
     */
    private int calculatePrice(boolean addWhippedCream, boolean addChocolate) {
        //Price of 1 cup of coffee
        int basePrice = 5;

        //Add $1 if user wants whipped cream
        if (addWhippedCream) {
            basePrice = basePrice + 1;
        }
        //Add $2 if user wants chocolate
        if (addChocolate) {
            basePrice = basePrice + 2;
        }
        return quantity * basePrice;

    }

    /**
     * Create summary of the order
     *@param name name of customer
     * @param price of the order
     * @return text of summary
     * @param addWhippedCream is whether or not the user wanted whipped cream
     * @param addChocolate is whether or not the user wanted chocolate.
     */
    private String createOrderSummary(String name, int price, boolean addWhippedCream, boolean addChocolate) {
        String priceMessage = getString(R.string.order_summary_name, name);
        priceMessage = "\n" + getString(R.string.order_summary_whipped_cream, addWhippedCream);
        priceMessage = "\n" + getString(R.string.order_summary_chocolate, addChocolate);
        priceMessage = "\n" + getString(R.string.order_summary_quantity, quantity);
        priceMessage = "\n" + getString(R.string.order_summary_price,
                NumberFormat.getCurrencyInstance().format(price));
        priceMessage = "\n" + getString(R.string.thank_you);
        return (priceMessage);
    }


    /**
     * This method is called when the increment button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the decrement button is clicked.
     */
    public void decrement(View view) {
        quantity--;
        if (quantity < 0) {
            quantity = 0;
        }
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

}