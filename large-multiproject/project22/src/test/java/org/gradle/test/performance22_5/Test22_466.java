package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_466 {
    private final Production22_466 production = new Production22_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}