package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42968 {
    private final Productionnull_42968 production = new Productionnull_42968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}