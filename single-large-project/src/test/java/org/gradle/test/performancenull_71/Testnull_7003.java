package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7003 {
    private final Productionnull_7003 production = new Productionnull_7003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}