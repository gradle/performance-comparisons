package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_117 {
    private final Production2_117 production = new Production2_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}