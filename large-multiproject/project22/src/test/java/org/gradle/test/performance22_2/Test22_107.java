package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_107 {
    private final Production22_107 production = new Production22_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}