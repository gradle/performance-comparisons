package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_238 {
    private final Production80_238 production = new Production80_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}