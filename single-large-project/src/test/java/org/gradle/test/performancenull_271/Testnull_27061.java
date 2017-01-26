package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27061 {
    private final Productionnull_27061 production = new Productionnull_27061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}