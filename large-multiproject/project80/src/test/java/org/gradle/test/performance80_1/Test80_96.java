package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_96 {
    private final Production80_96 production = new Production80_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}