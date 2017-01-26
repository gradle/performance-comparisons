package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_394 {
    private final Production3_394 production = new Production3_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}