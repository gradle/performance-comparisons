package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_39 {
    private final Production80_39 production = new Production80_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}