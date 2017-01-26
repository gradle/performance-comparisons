package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_104 {
    private final Production22_104 production = new Production22_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}