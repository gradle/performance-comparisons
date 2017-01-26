package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25577 {
    private final Productionnull_25577 production = new Productionnull_25577("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}