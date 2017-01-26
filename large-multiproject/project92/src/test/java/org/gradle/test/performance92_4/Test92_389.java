package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_389 {
    private final Production92_389 production = new Production92_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}