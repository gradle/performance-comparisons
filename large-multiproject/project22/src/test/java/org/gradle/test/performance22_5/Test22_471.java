package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_471 {
    private final Production22_471 production = new Production22_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}