package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_290 {
    private final Production22_290 production = new Production22_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}