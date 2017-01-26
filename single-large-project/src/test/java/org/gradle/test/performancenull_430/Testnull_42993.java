package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42993 {
    private final Productionnull_42993 production = new Productionnull_42993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}