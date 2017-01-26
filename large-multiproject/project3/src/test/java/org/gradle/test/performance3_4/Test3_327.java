package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_327 {
    private final Production3_327 production = new Production3_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}