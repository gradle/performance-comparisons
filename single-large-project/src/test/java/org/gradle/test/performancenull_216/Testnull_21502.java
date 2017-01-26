package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21502 {
    private final Productionnull_21502 production = new Productionnull_21502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}