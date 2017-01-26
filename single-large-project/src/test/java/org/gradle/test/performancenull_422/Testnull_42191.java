package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42191 {
    private final Productionnull_42191 production = new Productionnull_42191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}