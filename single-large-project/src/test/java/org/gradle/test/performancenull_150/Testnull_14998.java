package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14998 {
    private final Productionnull_14998 production = new Productionnull_14998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}