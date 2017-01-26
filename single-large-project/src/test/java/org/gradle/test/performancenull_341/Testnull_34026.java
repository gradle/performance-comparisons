package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34026 {
    private final Productionnull_34026 production = new Productionnull_34026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}