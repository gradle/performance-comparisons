package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_362 {
    private final Production22_362 production = new Production22_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}