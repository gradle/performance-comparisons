package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_1 {
    private final Production22_1 production = new Production22_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}