package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_225 {
    private final Productionnull_225 production = new Productionnull_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}