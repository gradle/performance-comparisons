package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42932 {
    private final Productionnull_42932 production = new Productionnull_42932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}