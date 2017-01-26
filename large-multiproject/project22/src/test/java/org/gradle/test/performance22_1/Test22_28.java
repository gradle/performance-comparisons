package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_28 {
    private final Production22_28 production = new Production22_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}