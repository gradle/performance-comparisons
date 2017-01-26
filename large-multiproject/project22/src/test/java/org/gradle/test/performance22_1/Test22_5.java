package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_5 {
    private final Production22_5 production = new Production22_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}