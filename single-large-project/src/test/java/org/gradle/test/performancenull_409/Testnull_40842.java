package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40842 {
    private final Productionnull_40842 production = new Productionnull_40842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}