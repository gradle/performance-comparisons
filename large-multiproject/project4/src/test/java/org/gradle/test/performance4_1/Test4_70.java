package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_70 {
    private final Production4_70 production = new Production4_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}