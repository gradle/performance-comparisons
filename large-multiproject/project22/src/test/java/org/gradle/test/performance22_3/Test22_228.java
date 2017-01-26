package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_228 {
    private final Production22_228 production = new Production22_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}