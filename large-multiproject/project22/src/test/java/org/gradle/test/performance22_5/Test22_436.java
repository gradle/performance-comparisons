package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_436 {
    private final Production22_436 production = new Production22_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}