package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_264 {
    private final Production22_264 production = new Production22_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}