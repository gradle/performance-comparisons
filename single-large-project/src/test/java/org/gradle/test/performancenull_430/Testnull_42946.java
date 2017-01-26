package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42946 {
    private final Productionnull_42946 production = new Productionnull_42946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}