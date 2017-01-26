package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42209 {
    private final Productionnull_42209 production = new Productionnull_42209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}