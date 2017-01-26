package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21147 {
    private final Productionnull_21147 production = new Productionnull_21147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}