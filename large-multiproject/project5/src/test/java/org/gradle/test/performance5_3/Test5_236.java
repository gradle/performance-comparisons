package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_236 {
    private final Production5_236 production = new Production5_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}