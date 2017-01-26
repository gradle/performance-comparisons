package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19138 {
    private final Productionnull_19138 production = new Productionnull_19138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}