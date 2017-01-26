package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_236 {
    private final Production20_236 production = new Production20_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}