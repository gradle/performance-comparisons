package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_165 {
    private final Production22_165 production = new Production22_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}