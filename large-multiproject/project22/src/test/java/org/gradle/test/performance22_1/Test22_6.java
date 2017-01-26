package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_6 {
    private final Production22_6 production = new Production22_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}