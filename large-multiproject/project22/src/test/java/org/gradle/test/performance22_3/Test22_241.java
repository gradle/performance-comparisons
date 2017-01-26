package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_241 {
    private final Production22_241 production = new Production22_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}