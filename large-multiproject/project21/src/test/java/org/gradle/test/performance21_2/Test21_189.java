package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_189 {
    private final Production21_189 production = new Production21_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}