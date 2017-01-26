package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_148 {
    private final Production22_148 production = new Production22_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}