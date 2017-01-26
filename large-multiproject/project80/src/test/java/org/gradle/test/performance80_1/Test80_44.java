package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_44 {
    private final Production80_44 production = new Production80_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}