package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_4 {
    private final Production22_4 production = new Production22_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}