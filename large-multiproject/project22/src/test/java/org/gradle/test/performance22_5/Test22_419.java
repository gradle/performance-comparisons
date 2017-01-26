package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_419 {
    private final Production22_419 production = new Production22_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}