package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_458 {
    private final Production80_458 production = new Production80_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}