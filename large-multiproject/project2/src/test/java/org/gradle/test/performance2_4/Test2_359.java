package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_359 {
    private final Production2_359 production = new Production2_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}