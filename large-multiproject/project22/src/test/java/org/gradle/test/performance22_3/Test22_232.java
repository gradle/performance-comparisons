package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_232 {
    private final Production22_232 production = new Production22_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}