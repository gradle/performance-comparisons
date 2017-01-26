package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39984 {
    private final Productionnull_39984 production = new Productionnull_39984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}