package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_344 {
    private final Production2_344 production = new Production2_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}