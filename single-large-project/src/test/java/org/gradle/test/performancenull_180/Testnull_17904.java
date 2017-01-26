package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17904 {
    private final Productionnull_17904 production = new Productionnull_17904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}