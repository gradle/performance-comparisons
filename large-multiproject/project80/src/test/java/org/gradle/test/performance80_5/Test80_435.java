package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_435 {
    private final Production80_435 production = new Production80_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}