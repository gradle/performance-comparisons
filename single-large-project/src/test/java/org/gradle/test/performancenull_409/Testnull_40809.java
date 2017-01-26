package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40809 {
    private final Productionnull_40809 production = new Productionnull_40809("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}