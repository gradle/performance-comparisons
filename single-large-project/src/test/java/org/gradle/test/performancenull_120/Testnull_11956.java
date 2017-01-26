package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11956 {
    private final Productionnull_11956 production = new Productionnull_11956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}