package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_243 {
    private final Production22_243 production = new Production22_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}