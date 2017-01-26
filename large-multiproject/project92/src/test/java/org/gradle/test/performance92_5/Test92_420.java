package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_420 {
    private final Production92_420 production = new Production92_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}