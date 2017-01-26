package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25061 {
    private final Productionnull_25061 production = new Productionnull_25061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}