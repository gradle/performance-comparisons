package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_474 {
    private final Production22_474 production = new Production22_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}