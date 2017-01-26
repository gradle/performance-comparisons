package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_161 {
    private final Production22_161 production = new Production22_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}