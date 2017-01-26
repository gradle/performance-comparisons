package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_262 {
    private final Production2_262 production = new Production2_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}