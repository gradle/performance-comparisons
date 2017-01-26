package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_236 {
    private final Production44_236 production = new Production44_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}