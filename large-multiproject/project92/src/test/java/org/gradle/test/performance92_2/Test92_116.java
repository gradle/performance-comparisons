package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_116 {
    private final Production92_116 production = new Production92_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}