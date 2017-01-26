package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_53 {
    private final Production80_53 production = new Production80_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}