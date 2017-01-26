package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25542 {
    private final Productionnull_25542 production = new Productionnull_25542("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}