package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_471 {
    private final Production80_471 production = new Production80_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}