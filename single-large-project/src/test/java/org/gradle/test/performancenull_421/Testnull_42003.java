package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42003 {
    private final Productionnull_42003 production = new Productionnull_42003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}