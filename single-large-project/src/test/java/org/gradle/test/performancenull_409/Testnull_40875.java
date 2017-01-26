package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40875 {
    private final Productionnull_40875 production = new Productionnull_40875("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}