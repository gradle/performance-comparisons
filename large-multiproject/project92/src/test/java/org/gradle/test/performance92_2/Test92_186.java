package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_186 {
    private final Production92_186 production = new Production92_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}