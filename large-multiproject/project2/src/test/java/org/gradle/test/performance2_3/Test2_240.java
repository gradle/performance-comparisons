package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_240 {
    private final Production2_240 production = new Production2_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}