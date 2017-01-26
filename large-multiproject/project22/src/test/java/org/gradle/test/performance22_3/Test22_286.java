package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_286 {
    private final Production22_286 production = new Production22_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}