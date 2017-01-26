package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12028 {
    private final Productionnull_12028 production = new Productionnull_12028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}