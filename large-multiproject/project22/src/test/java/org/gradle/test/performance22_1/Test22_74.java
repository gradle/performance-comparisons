package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_74 {
    private final Production22_74 production = new Production22_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}