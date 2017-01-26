package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_472 {
    private final Production22_472 production = new Production22_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}