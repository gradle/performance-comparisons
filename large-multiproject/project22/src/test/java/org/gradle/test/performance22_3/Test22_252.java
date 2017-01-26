package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_252 {
    private final Production22_252 production = new Production22_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}