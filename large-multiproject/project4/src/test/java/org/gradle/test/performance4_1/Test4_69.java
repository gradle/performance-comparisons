package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_69 {
    private final Production4_69 production = new Production4_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}