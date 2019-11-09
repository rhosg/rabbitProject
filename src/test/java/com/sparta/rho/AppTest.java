package com.sparta.rho;

import static org.junit.Assert.assertTrue;

import com.sparta.rho.animals.AnimalManager;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    AnimalManager animalManager;

    @Before
    public void setup() {
    animalManager = new AnimalManager();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
