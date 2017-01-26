package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28072 {
    private final Productionnull_28072 production = new Productionnull_28072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}