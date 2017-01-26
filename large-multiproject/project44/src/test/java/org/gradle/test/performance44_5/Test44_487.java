package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_487 {
    private final Production44_487 production = new Production44_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}