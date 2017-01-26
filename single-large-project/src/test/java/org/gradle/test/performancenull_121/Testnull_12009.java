package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12009 {
    private final Productionnull_12009 production = new Productionnull_12009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}