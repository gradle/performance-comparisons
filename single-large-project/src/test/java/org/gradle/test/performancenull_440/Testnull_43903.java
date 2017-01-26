package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43903 {
    private final Productionnull_43903 production = new Productionnull_43903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}