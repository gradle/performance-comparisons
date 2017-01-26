package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40492 {
    private final Productionnull_40492 production = new Productionnull_40492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}