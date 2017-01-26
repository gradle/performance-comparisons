package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_162 {
    private final Production22_162 production = new Production22_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}