package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_48 {
    private final Production22_48 production = new Production22_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}