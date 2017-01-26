package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_108 {
    private final Production92_108 production = new Production92_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}