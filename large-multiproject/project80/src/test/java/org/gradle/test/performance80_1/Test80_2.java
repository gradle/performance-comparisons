package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_2 {
    private final Production80_2 production = new Production80_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}