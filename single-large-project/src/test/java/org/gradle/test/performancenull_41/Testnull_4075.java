package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4075 {
    private final Productionnull_4075 production = new Productionnull_4075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}