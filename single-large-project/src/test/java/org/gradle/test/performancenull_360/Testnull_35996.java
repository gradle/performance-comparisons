package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35996 {
    private final Productionnull_35996 production = new Productionnull_35996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}