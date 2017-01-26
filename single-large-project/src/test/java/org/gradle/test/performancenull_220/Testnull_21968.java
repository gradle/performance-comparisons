package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21968 {
    private final Productionnull_21968 production = new Productionnull_21968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}