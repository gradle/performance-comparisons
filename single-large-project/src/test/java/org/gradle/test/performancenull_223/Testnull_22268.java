package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22268 {
    private final Productionnull_22268 production = new Productionnull_22268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}