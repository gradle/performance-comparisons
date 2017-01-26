package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_202 {
    private final Production22_202 production = new Production22_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}