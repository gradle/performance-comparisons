package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_29 {
    private final Production22_29 production = new Production22_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}