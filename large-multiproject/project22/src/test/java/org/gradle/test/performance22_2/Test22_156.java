package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_156 {
    private final Production22_156 production = new Production22_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}