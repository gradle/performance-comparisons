package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3492 {
    private final Productionnull_3492 production = new Productionnull_3492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}