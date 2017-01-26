package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_278 {
    private final Production44_278 production = new Production44_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}