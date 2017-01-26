package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4145 {
    private final Productionnull_4145 production = new Productionnull_4145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}