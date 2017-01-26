package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_137 {
    private final Production22_137 production = new Production22_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}