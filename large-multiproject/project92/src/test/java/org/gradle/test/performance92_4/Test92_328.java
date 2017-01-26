package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_328 {
    private final Production92_328 production = new Production92_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}