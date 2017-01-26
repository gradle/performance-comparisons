package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28099 {
    private final Productionnull_28099 production = new Productionnull_28099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}