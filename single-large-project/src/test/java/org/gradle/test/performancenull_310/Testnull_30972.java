package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30972 {
    private final Productionnull_30972 production = new Productionnull_30972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}