package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_33 {
    private final Production80_33 production = new Production80_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}