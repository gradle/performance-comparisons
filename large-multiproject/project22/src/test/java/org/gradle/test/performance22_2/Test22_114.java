package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_114 {
    private final Production22_114 production = new Production22_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}