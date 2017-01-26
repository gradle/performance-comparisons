package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_14 {
    private final Production80_14 production = new Production80_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}