package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_455 {
    private final Production22_455 production = new Production22_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}