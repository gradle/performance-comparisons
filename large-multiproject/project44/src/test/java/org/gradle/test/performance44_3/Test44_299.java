package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_299 {
    private final Production44_299 production = new Production44_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}