package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_398 {
    private final Production22_398 production = new Production22_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}