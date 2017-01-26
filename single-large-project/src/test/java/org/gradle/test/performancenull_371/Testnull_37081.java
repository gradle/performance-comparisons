package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37081 {
    private final Productionnull_37081 production = new Productionnull_37081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}