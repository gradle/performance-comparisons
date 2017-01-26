package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_310 {
    private final Production22_310 production = new Production22_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}