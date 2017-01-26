package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_41 {
    private final Production80_41 production = new Production80_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}