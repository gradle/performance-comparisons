package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42906 {
    private final Productionnull_42906 production = new Productionnull_42906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}