package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_441 {
    private final Production22_441 production = new Production22_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}