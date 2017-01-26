package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_240 {
    private final Production44_240 production = new Production44_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}