package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_279 {
    private final Production92_279 production = new Production92_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}