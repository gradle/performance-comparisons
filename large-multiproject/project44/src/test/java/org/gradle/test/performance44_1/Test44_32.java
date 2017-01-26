package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_32 {
    private final Production44_32 production = new Production44_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}