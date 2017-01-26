package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_405 {
    private final Production80_405 production = new Production80_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}