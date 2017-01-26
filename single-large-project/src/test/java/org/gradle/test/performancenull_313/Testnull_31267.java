package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31267 {
    private final Productionnull_31267 production = new Productionnull_31267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}