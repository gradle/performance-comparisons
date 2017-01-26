package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19126 {
    private final Productionnull_19126 production = new Productionnull_19126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}