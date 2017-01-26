package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_150 {
    private final Production22_150 production = new Production22_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}