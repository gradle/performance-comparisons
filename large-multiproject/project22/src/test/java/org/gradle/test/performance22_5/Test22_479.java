package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_479 {
    private final Production22_479 production = new Production22_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}