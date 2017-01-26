package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_15 {
    private final Production22_15 production = new Production22_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}