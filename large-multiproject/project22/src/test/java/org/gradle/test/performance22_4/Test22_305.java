package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_305 {
    private final Production22_305 production = new Production22_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}