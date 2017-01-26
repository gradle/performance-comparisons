package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42996 {
    private final Productionnull_42996 production = new Productionnull_42996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}