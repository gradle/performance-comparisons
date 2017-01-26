package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_285 {
    private final Production92_285 production = new Production92_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}