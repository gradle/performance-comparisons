package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_447 {
    private final Production22_447 production = new Production22_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}