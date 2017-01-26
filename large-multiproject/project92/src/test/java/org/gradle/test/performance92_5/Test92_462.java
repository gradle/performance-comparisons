package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_462 {
    private final Production92_462 production = new Production92_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}