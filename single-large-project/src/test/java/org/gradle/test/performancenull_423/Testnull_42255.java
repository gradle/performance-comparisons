package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42255 {
    private final Productionnull_42255 production = new Productionnull_42255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}