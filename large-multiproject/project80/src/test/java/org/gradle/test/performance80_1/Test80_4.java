package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_4 {
    private final Production80_4 production = new Production80_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}