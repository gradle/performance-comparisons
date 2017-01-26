package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_202 {
    private final Production80_202 production = new Production80_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}