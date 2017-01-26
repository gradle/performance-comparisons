package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_318 {
    private final Production22_318 production = new Production22_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}