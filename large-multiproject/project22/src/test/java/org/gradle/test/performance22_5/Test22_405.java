package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_405 {
    private final Production22_405 production = new Production22_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}