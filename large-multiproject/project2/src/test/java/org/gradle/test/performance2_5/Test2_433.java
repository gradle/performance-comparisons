package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_433 {
    private final Production2_433 production = new Production2_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}