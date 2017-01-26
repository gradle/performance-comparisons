package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_430 {
    private final Production2_430 production = new Production2_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}