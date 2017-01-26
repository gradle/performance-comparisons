package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_451 {
    private final Production2_451 production = new Production2_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}