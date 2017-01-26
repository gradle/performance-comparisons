package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42378 {
    private final Productionnull_42378 production = new Productionnull_42378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}