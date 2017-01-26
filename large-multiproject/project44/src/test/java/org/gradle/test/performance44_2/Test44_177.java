package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_177 {
    private final Production44_177 production = new Production44_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}