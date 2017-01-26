package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_71 {
    private final Production22_71 production = new Production22_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}