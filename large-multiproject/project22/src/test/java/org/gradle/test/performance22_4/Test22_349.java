package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_349 {
    private final Production22_349 production = new Production22_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}