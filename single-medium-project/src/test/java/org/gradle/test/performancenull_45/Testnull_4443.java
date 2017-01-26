package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4443 {
    private final Productionnull_4443 production = new Productionnull_4443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}