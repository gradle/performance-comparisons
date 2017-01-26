package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_164 {
    private final Production22_164 production = new Production22_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}