package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_35 {
    private final Production80_35 production = new Production80_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}