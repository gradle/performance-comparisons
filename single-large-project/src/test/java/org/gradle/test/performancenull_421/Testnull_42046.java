package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42046 {
    private final Productionnull_42046 production = new Productionnull_42046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}