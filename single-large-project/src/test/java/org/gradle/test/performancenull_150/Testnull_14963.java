package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14963 {
    private final Productionnull_14963 production = new Productionnull_14963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}