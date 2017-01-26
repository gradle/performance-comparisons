package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20230 {
    private final Productionnull_20230 production = new Productionnull_20230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}