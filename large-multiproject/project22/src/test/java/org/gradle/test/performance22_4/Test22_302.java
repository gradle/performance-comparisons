package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_302 {
    private final Production22_302 production = new Production22_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}