package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_335 {
    private final Production3_335 production = new Production3_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}