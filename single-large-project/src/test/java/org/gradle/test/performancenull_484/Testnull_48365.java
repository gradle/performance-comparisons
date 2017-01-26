package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48365 {
    private final Productionnull_48365 production = new Productionnull_48365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}