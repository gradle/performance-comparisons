package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42091 {
    private final Productionnull_42091 production = new Productionnull_42091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}