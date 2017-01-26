package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25082 {
    private final Productionnull_25082 production = new Productionnull_25082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}