package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23996 {
    private final Productionnull_23996 production = new Productionnull_23996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}