package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_270 {
    private final Production22_270 production = new Production22_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}