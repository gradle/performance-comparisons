package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41426 {
    private final Productionnull_41426 production = new Productionnull_41426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}