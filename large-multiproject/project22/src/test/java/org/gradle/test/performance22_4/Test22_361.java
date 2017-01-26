package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_361 {
    private final Production22_361 production = new Production22_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}