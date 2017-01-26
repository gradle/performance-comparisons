package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_330 {
    private final Production22_330 production = new Production22_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}