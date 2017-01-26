package org.gradle.test.performancenull_228;

import static org.junit.Assert.*;

public class Testnull_22790 {
    private final Productionnull_22790 production = new Productionnull_22790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}