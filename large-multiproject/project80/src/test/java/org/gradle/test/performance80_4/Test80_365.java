package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_365 {
    private final Production80_365 production = new Production80_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}