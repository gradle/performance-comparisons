package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_53 {
    private final Production22_53 production = new Production22_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}