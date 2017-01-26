package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_373 {
    private final Production22_373 production = new Production22_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}