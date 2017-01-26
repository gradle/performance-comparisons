package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_19 {
    private final Production4_19 production = new Production4_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}