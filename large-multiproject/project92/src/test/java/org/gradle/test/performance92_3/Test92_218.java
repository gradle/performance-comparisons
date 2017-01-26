package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_218 {
    private final Production92_218 production = new Production92_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}