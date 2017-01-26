package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3443 {
    private final Productionnull_3443 production = new Productionnull_3443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}