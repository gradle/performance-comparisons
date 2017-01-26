package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_80 {
    private final Production80_80 production = new Production80_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}