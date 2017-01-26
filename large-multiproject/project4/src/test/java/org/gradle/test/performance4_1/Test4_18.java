package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_18 {
    private final Production4_18 production = new Production4_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}