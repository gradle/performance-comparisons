package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_37 {
    private final Production22_37 production = new Production22_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}