package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_129 {
    private final Production92_129 production = new Production92_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}