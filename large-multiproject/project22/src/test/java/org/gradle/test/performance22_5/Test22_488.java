package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_488 {
    private final Production22_488 production = new Production22_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}