package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_159 {
    private final Production44_159 production = new Production44_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}