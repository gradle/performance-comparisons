package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_34 {
    private final Production80_34 production = new Production80_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}