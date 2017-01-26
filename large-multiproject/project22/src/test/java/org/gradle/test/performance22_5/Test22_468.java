package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_468 {
    private final Production22_468 production = new Production22_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}