package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_244 {
    private final Production22_244 production = new Production22_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}