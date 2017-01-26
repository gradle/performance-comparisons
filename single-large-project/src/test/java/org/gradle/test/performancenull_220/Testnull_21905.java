package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21905 {
    private final Productionnull_21905 production = new Productionnull_21905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}