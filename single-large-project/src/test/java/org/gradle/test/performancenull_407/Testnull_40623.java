package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40623 {
    private final Productionnull_40623 production = new Productionnull_40623("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}