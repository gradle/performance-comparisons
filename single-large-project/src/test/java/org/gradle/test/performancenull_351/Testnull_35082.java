package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35082 {
    private final Productionnull_35082 production = new Productionnull_35082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}