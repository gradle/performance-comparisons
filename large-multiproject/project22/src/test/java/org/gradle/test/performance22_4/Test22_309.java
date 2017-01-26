package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_309 {
    private final Production22_309 production = new Production22_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}