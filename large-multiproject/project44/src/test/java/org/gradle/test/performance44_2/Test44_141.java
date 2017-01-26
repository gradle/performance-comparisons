package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_141 {
    private final Production44_141 production = new Production44_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}