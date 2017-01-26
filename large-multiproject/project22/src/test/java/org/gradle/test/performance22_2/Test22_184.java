package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_184 {
    private final Production22_184 production = new Production22_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}