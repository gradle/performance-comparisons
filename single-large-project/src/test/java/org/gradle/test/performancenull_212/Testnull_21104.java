package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21104 {
    private final Productionnull_21104 production = new Productionnull_21104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}