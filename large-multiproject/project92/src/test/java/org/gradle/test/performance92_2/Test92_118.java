package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_118 {
    private final Production92_118 production = new Production92_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}