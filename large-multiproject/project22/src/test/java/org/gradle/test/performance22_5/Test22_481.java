package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_481 {
    private final Production22_481 production = new Production22_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}