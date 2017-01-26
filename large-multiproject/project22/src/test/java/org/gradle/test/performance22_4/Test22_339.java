package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_339 {
    private final Production22_339 production = new Production22_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}