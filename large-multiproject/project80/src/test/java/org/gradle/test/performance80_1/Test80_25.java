package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_25 {
    private final Production80_25 production = new Production80_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}