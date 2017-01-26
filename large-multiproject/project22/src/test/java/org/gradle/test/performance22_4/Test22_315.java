package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_315 {
    private final Production22_315 production = new Production22_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}