package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_140 {
    private final Production4_140 production = new Production4_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}