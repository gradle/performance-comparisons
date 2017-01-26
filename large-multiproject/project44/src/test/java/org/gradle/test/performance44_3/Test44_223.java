package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_223 {
    private final Production44_223 production = new Production44_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}