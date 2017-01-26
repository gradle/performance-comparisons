package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_30000 {
    private final Productionnull_30000 production = new Productionnull_30000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}