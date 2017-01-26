package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_57 {
    private final Production22_57 production = new Production22_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}