package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_60 {
    private final Production22_60 production = new Production22_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}