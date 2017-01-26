package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_253 {
    private final Production22_253 production = new Production22_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}