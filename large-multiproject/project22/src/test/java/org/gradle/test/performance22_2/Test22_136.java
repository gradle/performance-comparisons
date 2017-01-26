package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_136 {
    private final Production22_136 production = new Production22_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}