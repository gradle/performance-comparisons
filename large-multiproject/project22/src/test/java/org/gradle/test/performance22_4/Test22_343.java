package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_343 {
    private final Production22_343 production = new Production22_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}