package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_203 {
    private final Production22_203 production = new Production22_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}