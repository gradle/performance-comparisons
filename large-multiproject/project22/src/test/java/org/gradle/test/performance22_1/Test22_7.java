package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_7 {
    private final Production22_7 production = new Production22_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}