package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_415 {
    private final Production22_415 production = new Production22_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}