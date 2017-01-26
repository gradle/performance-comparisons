package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32470 {
    private final Productionnull_32470 production = new Productionnull_32470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}