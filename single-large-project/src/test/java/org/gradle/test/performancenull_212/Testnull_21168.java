package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21168 {
    private final Productionnull_21168 production = new Productionnull_21168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}