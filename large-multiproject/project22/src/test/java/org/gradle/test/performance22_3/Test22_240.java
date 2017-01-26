package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_240 {
    private final Production22_240 production = new Production22_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}