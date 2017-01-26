package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_418 {
    private final Production22_418 production = new Production22_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}