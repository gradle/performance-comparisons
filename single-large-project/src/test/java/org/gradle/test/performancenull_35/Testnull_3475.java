package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3475 {
    private final Productionnull_3475 production = new Productionnull_3475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}