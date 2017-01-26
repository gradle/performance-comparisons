package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_46 {
    private final Production22_46 production = new Production22_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}