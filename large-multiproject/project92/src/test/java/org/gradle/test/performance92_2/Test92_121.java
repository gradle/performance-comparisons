package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_121 {
    private final Production92_121 production = new Production92_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}