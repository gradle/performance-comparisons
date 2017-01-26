package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_179 {
    private final Production44_179 production = new Production44_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}