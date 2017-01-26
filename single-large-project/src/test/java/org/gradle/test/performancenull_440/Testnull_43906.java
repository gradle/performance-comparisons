package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43906 {
    private final Productionnull_43906 production = new Productionnull_43906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}