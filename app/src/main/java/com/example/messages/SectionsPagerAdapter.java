package com.example.messages;

import android.graphics.SweepGradient;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SectionsPagerAdapter extends FragmentPagerAdapter {


    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                RequestFragment requestFragment = new RequestFragment();
                return requestFragment;

            case 1:

                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 2:
                FriendsFragment friendsFragment = new FriendsFragment();
                return friendsFragment;

                default:
                    return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

 public CharSequence getPageTitle(int position){


     switch (position) {

         case 0:
             return "Requests";

         case 1:
             return "Chats";

         case 2:
             return "Friends";

         default:
             return null;

     }






    }
}
