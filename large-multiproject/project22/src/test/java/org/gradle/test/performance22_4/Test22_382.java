package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_382 {
    private final Production22_382 production = new Production22_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}