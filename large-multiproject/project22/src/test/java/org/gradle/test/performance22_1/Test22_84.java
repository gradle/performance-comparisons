package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_84 {
    private final Production22_84 production = new Production22_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}