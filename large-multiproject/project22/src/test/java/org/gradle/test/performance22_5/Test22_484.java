package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_484 {
    private final Production22_484 production = new Production22_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}