package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_1 {
    private final Production80_1 production = new Production80_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}