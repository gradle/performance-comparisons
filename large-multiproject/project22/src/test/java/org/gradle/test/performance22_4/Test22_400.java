package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_400 {
    private final Production22_400 production = new Production22_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}