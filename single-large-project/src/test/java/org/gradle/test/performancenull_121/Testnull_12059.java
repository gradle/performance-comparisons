package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12059 {
    private final Productionnull_12059 production = new Productionnull_12059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}