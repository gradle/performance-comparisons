package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43137 {
    private final Productionnull_43137 production = new Productionnull_43137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}