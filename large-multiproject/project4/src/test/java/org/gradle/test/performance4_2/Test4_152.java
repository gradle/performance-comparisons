package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_152 {
    private final Production4_152 production = new Production4_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}