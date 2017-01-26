package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_150 {
    private final Production4_150 production = new Production4_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}