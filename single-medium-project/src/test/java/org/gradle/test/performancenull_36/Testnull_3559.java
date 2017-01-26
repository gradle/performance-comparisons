package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3559 {
    private final Productionnull_3559 production = new Productionnull_3559("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}