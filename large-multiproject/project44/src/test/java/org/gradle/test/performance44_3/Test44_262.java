package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_262 {
    private final Production44_262 production = new Production44_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}