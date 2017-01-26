package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43929 {
    private final Productionnull_43929 production = new Productionnull_43929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}