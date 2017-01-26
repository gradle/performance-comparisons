package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_199 {
    private final Production22_199 production = new Production22_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}