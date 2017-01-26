package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47963 {
    private final Productionnull_47963 production = new Productionnull_47963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}