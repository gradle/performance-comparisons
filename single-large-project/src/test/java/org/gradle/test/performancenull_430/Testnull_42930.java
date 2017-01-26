package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42930 {
    private final Productionnull_42930 production = new Productionnull_42930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}