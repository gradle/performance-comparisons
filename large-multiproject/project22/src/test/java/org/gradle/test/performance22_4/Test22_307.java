package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_307 {
    private final Production22_307 production = new Production22_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}