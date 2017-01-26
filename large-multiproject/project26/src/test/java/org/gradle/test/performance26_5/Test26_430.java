package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_430 {
    private final Production26_430 production = new Production26_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}