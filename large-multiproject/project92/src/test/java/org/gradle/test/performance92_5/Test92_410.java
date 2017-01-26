package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_410 {
    private final Production92_410 production = new Production92_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}