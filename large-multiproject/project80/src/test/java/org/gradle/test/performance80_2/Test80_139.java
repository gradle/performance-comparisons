package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_139 {
    private final Production80_139 production = new Production80_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}