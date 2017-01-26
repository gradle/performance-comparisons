package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_352 {
    private final Production22_352 production = new Production22_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}