package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_277 {
    private final Production44_277 production = new Production44_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}