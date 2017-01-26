package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3979 {
    private final Productionnull_3979 production = new Productionnull_3979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}