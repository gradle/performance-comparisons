package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42094 {
    private final Productionnull_42094 production = new Productionnull_42094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}