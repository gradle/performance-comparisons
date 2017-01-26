package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_80 {
    private final Productionnull_80 production = new Productionnull_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}