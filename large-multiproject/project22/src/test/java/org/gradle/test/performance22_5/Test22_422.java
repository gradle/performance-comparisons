package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_422 {
    private final Production22_422 production = new Production22_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}