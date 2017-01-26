package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_448 {
    private final Production2_448 production = new Production2_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}