package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_143 {
    private final Production4_143 production = new Production4_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}