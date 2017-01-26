package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_320 {
    private final Production22_320 production = new Production22_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}