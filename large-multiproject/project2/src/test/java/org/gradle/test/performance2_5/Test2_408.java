package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_408 {
    private final Production2_408 production = new Production2_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}