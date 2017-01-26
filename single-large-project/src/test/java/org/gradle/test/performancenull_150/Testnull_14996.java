package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14996 {
    private final Productionnull_14996 production = new Productionnull_14996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}