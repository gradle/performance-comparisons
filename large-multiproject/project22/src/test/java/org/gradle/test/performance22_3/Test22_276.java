package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_276 {
    private final Production22_276 production = new Production22_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}