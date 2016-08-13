package com.example.akshay.yash;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.bowyer.app.fabtransitionlayout.FooterLayout;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.bowyer.app.fabtoolbar.FabToolbar;
import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;
public class BaseActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    protected DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.base, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_map) {
            Intent intent=new Intent(this,Map.class);
            startActivity(intent);
        } else if (id == R.id.nav_schedule) {
            Intent intent=new Intent(this,Schedule.class);
            startActivity(intent);
        } else if (id == R.id.nav_sponsers) {
                Intent intent=new Intent(this,Sponsers.class);
                startActivity(intent);
        }
        else if (id==R.id.nav_events){
            Intent intent=new Intent(this,Events.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_teams){
            Intent intent=new Intent(this,Teams.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_developed_by){
            Intent intent=new Intent(this,DevelopedBy.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

  /*  @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {

    }

    @Override
    public void onDownMotionEvent() {

    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
        if (scrollState == ScrollState.UP) {
            mFabToolbar.slideOutFab();
        } else if (scrollState == ScrollState.DOWN) {
            mFabToolbar.slideInFab();
        }

    }
    @OnClick(R.id.fab)
    void onFabClick() {
        mFabToolbar.expandFab();
    }

   @OnClick(R.id.call)
    void onClickCall() {
        iconAnim(mIcCall);
    }

    @OnClick(R.id.ic_email)
    void onClickEmail() {
        iconAnim(mIcEmail);
    }

    @OnClick(R.id.ic_forum)
    void onClickForum() {
        iconAnim(mIcForum);
    }

    private void iconAnim(View icon) {
        Animator iconAnim = ObjectAnimator.ofPropertyValuesHolder(
                icon,
                PropertyValuesHolder.ofFloat("scaleX", 1f, 1.5f, 1f),
                PropertyValuesHolder.ofFloat("scaleY", 1f, 1.5f, 1f));
        iconAnim.start();
    }*/
}
