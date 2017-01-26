package org.gradle.test.performancenull_109;

import static org.junit.Assert.*;

public class Testnull_10845 {
    private final Productionnull_10845 production = new Productionnull_10845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}