package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35026 {
    private final Productionnull_35026 production = new Productionnull_35026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}