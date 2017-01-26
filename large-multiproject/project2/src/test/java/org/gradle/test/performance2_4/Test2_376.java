package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_376 {
    private final Production2_376 production = new Production2_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}