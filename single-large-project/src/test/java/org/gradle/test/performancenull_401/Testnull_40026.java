package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40026 {
    private final Productionnull_40026 production = new Productionnull_40026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}