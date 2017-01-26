package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5443 {
    private final Productionnull_5443 production = new Productionnull_5443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}