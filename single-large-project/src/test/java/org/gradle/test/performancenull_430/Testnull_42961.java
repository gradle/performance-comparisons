package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42961 {
    private final Productionnull_42961 production = new Productionnull_42961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}