package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_493 {
    private final Production3_493 production = new Production3_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}