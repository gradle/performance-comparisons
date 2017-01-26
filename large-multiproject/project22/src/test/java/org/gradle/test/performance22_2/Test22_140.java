package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_140 {
    private final Production22_140 production = new Production22_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}