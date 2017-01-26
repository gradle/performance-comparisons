package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39953 {
    private final Productionnull_39953 production = new Productionnull_39953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}