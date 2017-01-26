package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_245 {
    private final Production44_245 production = new Production44_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}