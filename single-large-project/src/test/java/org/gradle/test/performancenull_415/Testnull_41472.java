package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41472 {
    private final Productionnull_41472 production = new Productionnull_41472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}