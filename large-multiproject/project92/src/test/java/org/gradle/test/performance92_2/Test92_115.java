package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_115 {
    private final Production92_115 production = new Production92_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}