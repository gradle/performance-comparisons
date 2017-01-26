package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_414 {
    private final Production3_414 production = new Production3_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}