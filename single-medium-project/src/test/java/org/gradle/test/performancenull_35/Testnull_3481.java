package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3481 {
    private final Productionnull_3481 production = new Productionnull_3481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}