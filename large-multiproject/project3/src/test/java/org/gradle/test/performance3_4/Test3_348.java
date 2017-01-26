package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_348 {
    private final Production3_348 production = new Production3_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}