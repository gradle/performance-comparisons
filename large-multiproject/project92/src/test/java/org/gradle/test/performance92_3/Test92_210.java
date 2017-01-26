package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_210 {
    private final Production92_210 production = new Production92_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}