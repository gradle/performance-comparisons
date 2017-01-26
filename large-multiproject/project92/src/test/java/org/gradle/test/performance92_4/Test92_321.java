package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_321 {
    private final Production92_321 production = new Production92_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}