package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42035 {
    private final Productionnull_42035 production = new Productionnull_42035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}