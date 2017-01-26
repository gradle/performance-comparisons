package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_197 {
    private final Production22_197 production = new Production22_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}