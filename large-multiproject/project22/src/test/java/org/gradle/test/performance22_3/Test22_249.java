package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_249 {
    private final Production22_249 production = new Production22_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}