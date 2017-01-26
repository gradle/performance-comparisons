package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_165 {
    private final Production92_165 production = new Production92_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}