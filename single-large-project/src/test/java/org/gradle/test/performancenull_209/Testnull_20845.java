package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20845 {
    private final Productionnull_20845 production = new Productionnull_20845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}