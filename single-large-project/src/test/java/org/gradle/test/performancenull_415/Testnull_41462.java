package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41462 {
    private final Productionnull_41462 production = new Productionnull_41462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}