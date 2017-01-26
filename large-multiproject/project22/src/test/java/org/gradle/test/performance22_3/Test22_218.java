package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_218 {
    private final Production22_218 production = new Production22_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}