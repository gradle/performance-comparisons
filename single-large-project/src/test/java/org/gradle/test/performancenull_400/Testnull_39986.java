package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39986 {
    private final Productionnull_39986 production = new Productionnull_39986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}