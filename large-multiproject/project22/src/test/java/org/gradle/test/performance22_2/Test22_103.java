package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_103 {
    private final Production22_103 production = new Production22_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}