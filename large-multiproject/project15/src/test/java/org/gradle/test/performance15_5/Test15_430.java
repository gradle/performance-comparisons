package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_430 {
    private final Production15_430 production = new Production15_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}