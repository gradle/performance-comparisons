package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_180 {
    private final Production22_180 production = new Production22_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}