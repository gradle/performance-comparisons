package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_304 {
    private final Production22_304 production = new Production22_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}