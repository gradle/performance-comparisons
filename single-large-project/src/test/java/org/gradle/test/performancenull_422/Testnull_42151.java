package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42151 {
    private final Productionnull_42151 production = new Productionnull_42151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}