package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48492 {
    private final Productionnull_48492 production = new Productionnull_48492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}