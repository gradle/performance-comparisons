package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19996 {
    private final Productionnull_19996 production = new Productionnull_19996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}