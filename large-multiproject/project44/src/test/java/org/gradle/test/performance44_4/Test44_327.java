package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_327 {
    private final Production44_327 production = new Production44_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}