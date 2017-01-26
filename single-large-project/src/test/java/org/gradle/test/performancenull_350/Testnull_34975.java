package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34975 {
    private final Productionnull_34975 production = new Productionnull_34975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}