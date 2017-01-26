package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_164 {
    private final Production92_164 production = new Production92_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}