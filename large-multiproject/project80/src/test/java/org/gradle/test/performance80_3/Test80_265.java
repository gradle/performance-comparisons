package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_265 {
    private final Production80_265 production = new Production80_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}