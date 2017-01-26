package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_365 {
    private final Production22_365 production = new Production22_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}