package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30503 {
    private final Productionnull_30503 production = new Productionnull_30503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}