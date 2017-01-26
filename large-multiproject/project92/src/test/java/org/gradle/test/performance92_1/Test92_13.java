package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_13 {
    private final Production92_13 production = new Production92_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}