package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27280 {
    private final Productionnull_27280 production = new Productionnull_27280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}