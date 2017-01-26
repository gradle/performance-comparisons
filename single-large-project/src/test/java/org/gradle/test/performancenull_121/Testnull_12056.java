package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12056 {
    private final Productionnull_12056 production = new Productionnull_12056("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}