package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_333 {
    private final Production3_333 production = new Production3_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}