package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18066 {
    private final Productionnull_18066 production = new Productionnull_18066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}