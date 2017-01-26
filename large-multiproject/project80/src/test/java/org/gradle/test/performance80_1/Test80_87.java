package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_87 {
    private final Production80_87 production = new Production80_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}