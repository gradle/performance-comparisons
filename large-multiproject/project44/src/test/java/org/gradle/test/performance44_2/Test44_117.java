package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_117 {
    private final Production44_117 production = new Production44_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}