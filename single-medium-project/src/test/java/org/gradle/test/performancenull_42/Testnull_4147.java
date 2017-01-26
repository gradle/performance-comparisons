package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4147 {
    private final Productionnull_4147 production = new Productionnull_4147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}