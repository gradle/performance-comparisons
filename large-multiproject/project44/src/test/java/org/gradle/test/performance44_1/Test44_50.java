package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_50 {
    private final Production44_50 production = new Production44_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}