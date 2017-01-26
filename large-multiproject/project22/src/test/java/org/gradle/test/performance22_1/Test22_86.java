package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_86 {
    private final Production22_86 production = new Production22_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}