package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_236 {
    private final Production22_236 production = new Production22_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}