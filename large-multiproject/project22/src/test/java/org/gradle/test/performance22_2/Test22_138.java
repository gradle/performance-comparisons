package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_138 {
    private final Production22_138 production = new Production22_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}