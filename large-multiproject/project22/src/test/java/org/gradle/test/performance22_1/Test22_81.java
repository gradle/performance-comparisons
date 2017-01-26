package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_81 {
    private final Production22_81 production = new Production22_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}