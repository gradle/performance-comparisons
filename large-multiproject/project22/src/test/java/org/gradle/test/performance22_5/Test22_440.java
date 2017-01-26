package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_440 {
    private final Production22_440 production = new Production22_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}