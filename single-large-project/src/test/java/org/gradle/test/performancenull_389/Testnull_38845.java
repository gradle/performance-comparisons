package org.gradle.test.performancenull_389;

import static org.junit.Assert.*;

public class Testnull_38845 {
    private final Productionnull_38845 production = new Productionnull_38845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}