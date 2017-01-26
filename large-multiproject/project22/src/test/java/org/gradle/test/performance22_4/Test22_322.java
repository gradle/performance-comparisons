package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_322 {
    private final Production22_322 production = new Production22_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}