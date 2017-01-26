package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_83 {
    private final Production92_83 production = new Production92_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}