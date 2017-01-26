package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_229 {
    private final Production80_229 production = new Production80_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}