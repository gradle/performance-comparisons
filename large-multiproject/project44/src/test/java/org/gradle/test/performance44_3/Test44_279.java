package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_279 {
    private final Production44_279 production = new Production44_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}