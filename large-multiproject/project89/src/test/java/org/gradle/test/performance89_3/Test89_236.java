package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_236 {
    private final Production89_236 production = new Production89_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}