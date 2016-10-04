package com.example.mockito;

import com.example.mockito.model.User;
import com.example.mockito.presenter.Compute;
import com.example.mockito.presenter.ComputeImpl;
import com.example.mockito.view.Display;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Anand on 04/10/2016.
 */
public class ComputeTest {

    User user;
    Compute compute;
    Display mockDisplay;

    @Before
    public void setUp() {
        user = new User();
        user.setId(1);
        user.setFirstName("First");
        user.setLastName("Last");

        compute = new ComputeImpl(user);

        mockDisplay = mock(Display.class);
    }

    @Test
    public void shouldDisplayUserIdTwoTimes() {
        compute.setDisplay(mockDisplay);

        verify(mockDisplay, times(2)).showId(anyInt());
    }

    @Test
    public void shouldDisplayFirstAndLastNamesThreeTimes() {
        compute.setDisplay(mockDisplay);

        verify(mockDisplay, times(3)).showFirstName(anyString());
        verify(mockDisplay, times(3)).showLastName(anyString());
    }
}