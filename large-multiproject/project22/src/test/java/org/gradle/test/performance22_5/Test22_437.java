package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_437 {
    private final Production22_437 production = new Production22_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}