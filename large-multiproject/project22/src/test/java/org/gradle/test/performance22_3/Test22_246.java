package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_246 {
    private final Production22_246 production = new Production22_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}