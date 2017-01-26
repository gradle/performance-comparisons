package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40081 {
    private final Productionnull_40081 production = new Productionnull_40081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}