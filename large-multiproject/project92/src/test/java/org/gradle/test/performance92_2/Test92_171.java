package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_171 {
    private final Production92_171 production = new Production92_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}