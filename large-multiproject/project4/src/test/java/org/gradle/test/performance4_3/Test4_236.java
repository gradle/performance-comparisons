package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_236 {
    private final Production4_236 production = new Production4_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}