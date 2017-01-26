package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_172 {
    private final Productionnull_172 production = new Productionnull_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}