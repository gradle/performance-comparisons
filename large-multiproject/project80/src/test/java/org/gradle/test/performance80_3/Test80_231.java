package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_231 {
    private final Production80_231 production = new Production80_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}