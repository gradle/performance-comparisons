package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_306 {
    private final Production22_306 production = new Production22_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}