package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40361 {
    private final Productionnull_40361 production = new Productionnull_40361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}