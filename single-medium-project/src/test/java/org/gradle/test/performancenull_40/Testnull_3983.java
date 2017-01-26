package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3983 {
    private final Productionnull_3983 production = new Productionnull_3983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}