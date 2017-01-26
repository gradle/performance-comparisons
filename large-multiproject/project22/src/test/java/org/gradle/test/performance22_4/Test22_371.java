package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_371 {
    private final Production22_371 production = new Production22_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}