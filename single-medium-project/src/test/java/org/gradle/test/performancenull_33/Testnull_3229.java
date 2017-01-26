package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3229 {
    private final Productionnull_3229 production = new Productionnull_3229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}