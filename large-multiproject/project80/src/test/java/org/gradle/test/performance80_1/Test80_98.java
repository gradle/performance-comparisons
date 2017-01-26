package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_98 {
    private final Production80_98 production = new Production80_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}