package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_408 {
    private final Production44_408 production = new Production44_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}