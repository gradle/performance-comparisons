package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_28 {
    private final Production80_28 production = new Production80_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}