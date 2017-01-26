package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_477 {
    private final Production22_477 production = new Production22_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}