package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_100 {
    private final Productionnull_100 production = new Productionnull_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}