package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_55 {
    private final Production22_55 production = new Production22_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}