package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42040 {
    private final Productionnull_42040 production = new Productionnull_42040("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}