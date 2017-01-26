package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_127 {
    private final Production4_127 production = new Production4_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}