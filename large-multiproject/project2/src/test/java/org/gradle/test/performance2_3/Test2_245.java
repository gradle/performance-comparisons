package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_245 {
    private final Production2_245 production = new Production2_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}