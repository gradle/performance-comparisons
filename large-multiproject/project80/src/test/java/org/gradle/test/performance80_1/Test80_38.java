package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_38 {
    private final Production80_38 production = new Production80_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}