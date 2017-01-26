package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_235 {
    private final Production22_235 production = new Production22_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}