package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_177 {
    private final Production5_177 production = new Production5_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}