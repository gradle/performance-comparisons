package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_222 {
    private final Production22_222 production = new Production22_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}