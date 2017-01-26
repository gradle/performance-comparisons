package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_47 {
    private final Production22_47 production = new Production22_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}