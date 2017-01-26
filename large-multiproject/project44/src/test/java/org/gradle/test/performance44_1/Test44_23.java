package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_23 {
    private final Production44_23 production = new Production44_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}