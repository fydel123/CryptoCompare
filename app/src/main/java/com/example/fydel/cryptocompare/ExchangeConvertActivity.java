package com.example.fydel.cryptocompare;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ExchangeConvertActivity extends Activity {

    String currencyCode;
    String currencyFullName;
    EditText btcValueEdit, ethValueEdit, flatValueEdit;
    ImageButton btcConvertButton, ethConvertButton, flatConvertButton, FCBtn;

    double btcRate;
    double ethRate;

    TextView moneyCodeView;
    TextView fullNameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        Intent intent = getIntent();
        currencyCode = intent.getStringExtra(FixedValues.EXTRA_CURRENCY);
        btcRate = intent.getDoubleExtra(FixedValues.EXTRA_BTC_RATE, 0);
        ethRate = intent.getDoubleExtra(FixedValues.EXTRA_ETH_RATE, 0);
        currencyFullName = getFullName(currencyCode);
        String conversionMessage = currencyFullName;

        moneyCodeView.setText(currencyCode);
        fullNameView.setText(conversionMessage);
        if(getActionBar() != null) getActionBar().setTitle(currencyFullName);

    }

    //Display currency names for each currency
    public String getFullName(String moneyCode) {
        switch (moneyCode) {

            case "AFN": return "Afghanistan Afghani Conversion Screen";
            case "DZD": return "Algerian Dinar Conversion Screen";
            case "NGN": return "Naira Conversion Screen";
            case "UGX": return "Ugandan Shilling Conversion Screen";
            case "ZAR": return "Rand Conversion Screen";
            case "XAF": return "CFA Franc BCEAO Conversion Screen";
            case "NZD": return "New Zealand Dollar Conversion Screen";
            case "MYR": return "Malaysian Ringgit Conversion Screen";
            case "BND": return "Brunei Dollar Conversion Screen";
            case "GEL": return "Georgian Lari Conversion Screen";
            case "EGP": return "Egyptian Pound Conversion Screen";
            case "RUB": return "Russian Ruble Conversion Screen";
            case "INR": return "Indian Rupee Conversion Screen";
            case "USD": return "US Dollar Conversion Screen";
            case "EUR": return "Euro Conversion Screen";
            case "JPY": return "Yen Conversion Screen";
            case "KES": return "Kenyan Shilling Conversion Screen";
            case "GHS": return "Cedi Conversion Screen";
            case "GBP": return "Pound Sterling Conversion Screen";
            case "AUD": return "Australian Dollar Conversion Screen";
            case "XOF": return "West African CFA Conversion Screen";
            case "CAD": return "Canadian Dollar Conversion Screen";
            case "CHF": return "Swiss Franc Conversion Screen";
            case "CNY": return "Yuan Conversion Screen";
            default: return "Currency Converter";

        }
    }



}

