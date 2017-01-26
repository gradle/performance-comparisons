package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31289 {
    private final Productionnull_31289 production = new Productionnull_31289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}