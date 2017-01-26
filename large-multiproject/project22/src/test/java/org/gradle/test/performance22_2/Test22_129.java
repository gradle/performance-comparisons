package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_129 {
    private final Production22_129 production = new Production22_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}