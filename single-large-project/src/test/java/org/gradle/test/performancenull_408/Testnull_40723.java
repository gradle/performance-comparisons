package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40723 {
    private final Productionnull_40723 production = new Productionnull_40723("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}