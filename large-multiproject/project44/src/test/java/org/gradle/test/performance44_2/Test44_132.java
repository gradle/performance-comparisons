package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_132 {
    private final Production44_132 production = new Production44_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}