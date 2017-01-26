package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7926 {
    private final Productionnull_7926 production = new Productionnull_7926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}