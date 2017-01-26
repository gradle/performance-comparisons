package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_63 {
    private final Production22_63 production = new Production22_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}