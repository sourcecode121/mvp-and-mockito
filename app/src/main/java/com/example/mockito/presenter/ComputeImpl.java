package com.example.mockito.presenter;

import com.example.mockito.model.User;
import com.example.mockito.presenter.Compute;
import com.example.mockito.view.Display;

/**
 * Created by Anand on 04/10/2016.
 */
public class ComputeImpl implements Compute {

    private User user;
    private Display display;

    public ComputeImpl(User user) {
        this.user = user;
    }

    @Override
    public void method1() {
        for (int i = 0; i < 5; i++) {
            if (i < 2) {
                method2();
            }
            else {
                method3();
            }
        }
    }

    @Override
    public int method2() {
        display.showId(user.getId());
        return 0;
    }

    @Override
    public int method3() {
        display.showFirstName(user.getFirstName());
        display.showLastName(user.getLastName());
        return 0;
    }

    @Override
    public void setDisplay(Display display) {
        this.display = display;
        method1();
    }
}
