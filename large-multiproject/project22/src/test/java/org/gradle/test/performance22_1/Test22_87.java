package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_87 {
    private final Production22_87 production = new Production22_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}