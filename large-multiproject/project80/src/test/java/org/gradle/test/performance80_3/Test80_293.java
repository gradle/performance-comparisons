package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_293 {
    private final Production80_293 production = new Production80_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}