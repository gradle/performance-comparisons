package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_380 {
    private final Production22_380 production = new Production22_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}