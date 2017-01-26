package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_92 {
    private final Production80_92 production = new Production80_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}