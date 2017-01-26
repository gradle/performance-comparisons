package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18209 {
    private final Productionnull_18209 production = new Productionnull_18209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}