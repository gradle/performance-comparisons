package org.gradle.test.performancenull_437;

import static org.junit.Assert.*;

public class Testnull_43668 {
    private final Productionnull_43668 production = new Productionnull_43668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}