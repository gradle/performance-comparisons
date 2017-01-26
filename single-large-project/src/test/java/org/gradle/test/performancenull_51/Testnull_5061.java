package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5061 {
    private final Productionnull_5061 production = new Productionnull_5061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}