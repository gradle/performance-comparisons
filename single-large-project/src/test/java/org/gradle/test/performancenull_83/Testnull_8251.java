package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8251 {
    private final Productionnull_8251 production = new Productionnull_8251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}