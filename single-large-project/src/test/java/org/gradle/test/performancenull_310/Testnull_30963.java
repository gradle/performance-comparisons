package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30963 {
    private final Productionnull_30963 production = new Productionnull_30963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}