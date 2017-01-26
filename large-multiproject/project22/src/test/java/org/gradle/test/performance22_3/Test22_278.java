package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_278 {
    private final Production22_278 production = new Production22_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}