package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_486 {
    private final Production92_486 production = new Production92_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}