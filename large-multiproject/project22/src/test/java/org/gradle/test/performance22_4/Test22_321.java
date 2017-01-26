package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_321 {
    private final Production22_321 production = new Production22_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}