package org.gradle.test.performancenull_229;

import static org.junit.Assert.*;

public class Testnull_22845 {
    private final Productionnull_22845 production = new Productionnull_22845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}