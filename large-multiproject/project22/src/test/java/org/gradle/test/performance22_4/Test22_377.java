package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_377 {
    private final Production22_377 production = new Production22_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}