package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_177 {
    private final Production20_177 production = new Production20_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}