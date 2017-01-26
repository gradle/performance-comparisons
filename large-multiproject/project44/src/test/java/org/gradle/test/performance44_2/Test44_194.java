package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_194 {
    private final Production44_194 production = new Production44_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}