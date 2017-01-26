package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_229 {
    private final Production22_229 production = new Production22_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}