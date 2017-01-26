package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21138 {
    private final Productionnull_21138 production = new Productionnull_21138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}