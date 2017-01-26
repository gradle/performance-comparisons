package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_181 {
    private final Production22_181 production = new Production22_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}