package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27026 {
    private final Productionnull_27026 production = new Productionnull_27026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}