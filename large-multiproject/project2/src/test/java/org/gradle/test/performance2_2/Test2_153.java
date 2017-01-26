package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_153 {
    private final Production2_153 production = new Production2_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}