package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8473 {
    private final Productionnull_8473 production = new Productionnull_8473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}