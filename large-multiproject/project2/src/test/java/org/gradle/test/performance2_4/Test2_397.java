package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_397 {
    private final Production2_397 production = new Production2_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}