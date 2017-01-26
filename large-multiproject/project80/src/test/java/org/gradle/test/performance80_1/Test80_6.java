package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_6 {
    private final Production80_6 production = new Production80_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}