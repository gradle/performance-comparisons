package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_175 {
    private final Production80_175 production = new Production80_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}