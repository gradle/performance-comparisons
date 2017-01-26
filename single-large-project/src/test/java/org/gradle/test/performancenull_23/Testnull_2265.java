package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2265 {
    private final Productionnull_2265 production = new Productionnull_2265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}