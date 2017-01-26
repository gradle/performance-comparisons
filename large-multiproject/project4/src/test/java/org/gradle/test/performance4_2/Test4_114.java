package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_114 {
    private final Production4_114 production = new Production4_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}