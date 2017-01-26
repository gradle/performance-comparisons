package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_177 {
    private final Production22_177 production = new Production22_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}