package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_394 {
    private final Production44_394 production = new Production44_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}