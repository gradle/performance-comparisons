package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_156 {
    private final Production4_156 production = new Production4_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}