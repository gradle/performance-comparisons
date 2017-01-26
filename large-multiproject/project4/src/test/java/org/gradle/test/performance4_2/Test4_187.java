package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_187 {
    private final Production4_187 production = new Production4_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}