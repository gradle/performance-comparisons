package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_284 {
    private final Production92_284 production = new Production92_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}