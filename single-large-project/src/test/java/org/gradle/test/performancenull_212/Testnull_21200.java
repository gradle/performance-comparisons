package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21200 {
    private final Productionnull_21200 production = new Productionnull_21200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}