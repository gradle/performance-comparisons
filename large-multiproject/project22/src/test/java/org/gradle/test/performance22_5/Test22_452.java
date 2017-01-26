package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_452 {
    private final Production22_452 production = new Production22_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}