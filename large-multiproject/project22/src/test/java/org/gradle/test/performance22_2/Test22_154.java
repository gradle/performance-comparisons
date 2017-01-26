package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_154 {
    private final Production22_154 production = new Production22_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}