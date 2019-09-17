package com.example.nettotestdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Element adsElement=new Element();
        adsElement.setTitle("Advertise Here ");
        View aboutPage = new AboutPage(this)

                .isRTL(false)
                .setImage(R.mipmap.cover)
                .addItem(new Element().setTitle("الإصدار الأول"))
                .addItem(adsElement)
                .addGroup("Connect with us")
                .addEmail("Deutsch4you.Team@gmail.com")
                .addWebsite("http://dsh4you.net")
                .addFacebook("almania3eounarabia")
                .addTwitter("3eounArbia")
                .addYoutube("UCEPJH3GCMViifo0eHURz8_w")
                .addInstagram("Almania_3eoun_Arbia")
                .addItem(getCopyRightsElement())
                .create();
        setContentView(aboutPage);

    }



    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();

        final String copyrights = String.format("Copyright %d by Malek khatab und Shadi Al salamat ", Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.mipmap.cover);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutus.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }



}
