package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_145 {
    private final Production22_145 production = new Production22_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}