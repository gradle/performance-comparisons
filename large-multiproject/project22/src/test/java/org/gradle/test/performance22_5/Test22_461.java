package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_461 {
    private final Production22_461 production = new Production22_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}