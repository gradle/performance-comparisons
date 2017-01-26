package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_278 {
    private final Production2_278 production = new Production2_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}