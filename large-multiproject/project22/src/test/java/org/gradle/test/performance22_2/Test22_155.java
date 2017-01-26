package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_155 {
    private final Production22_155 production = new Production22_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}