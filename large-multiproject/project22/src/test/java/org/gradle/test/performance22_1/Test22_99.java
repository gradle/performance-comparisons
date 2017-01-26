package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_99 {
    private final Production22_99 production = new Production22_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}