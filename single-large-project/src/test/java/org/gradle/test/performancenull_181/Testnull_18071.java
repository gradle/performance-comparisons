package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18071 {
    private final Productionnull_18071 production = new Productionnull_18071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}