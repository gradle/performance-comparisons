package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_423 {
    private final Production22_423 production = new Production22_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}