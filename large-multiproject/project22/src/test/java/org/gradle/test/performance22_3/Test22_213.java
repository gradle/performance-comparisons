package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_213 {
    private final Production22_213 production = new Production22_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}