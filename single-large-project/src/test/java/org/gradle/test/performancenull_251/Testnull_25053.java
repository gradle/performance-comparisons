package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25053 {
    private final Productionnull_25053 production = new Productionnull_25053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}