package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_248 {
    private final Production44_248 production = new Production44_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}