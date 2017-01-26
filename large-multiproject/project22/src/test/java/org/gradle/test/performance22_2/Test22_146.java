package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_146 {
    private final Production22_146 production = new Production22_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}