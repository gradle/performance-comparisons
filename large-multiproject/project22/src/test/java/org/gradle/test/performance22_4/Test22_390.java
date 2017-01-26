package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_390 {
    private final Production22_390 production = new Production22_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}