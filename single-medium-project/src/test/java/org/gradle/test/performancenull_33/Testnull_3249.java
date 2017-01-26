package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3249 {
    private final Productionnull_3249 production = new Productionnull_3249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}