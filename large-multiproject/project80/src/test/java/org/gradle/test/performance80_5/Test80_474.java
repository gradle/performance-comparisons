package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_474 {
    private final Production80_474 production = new Production80_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}