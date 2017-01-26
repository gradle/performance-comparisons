package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_127 {
    private final Production22_127 production = new Production22_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}