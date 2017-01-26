package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_186 {
    private final Production4_186 production = new Production4_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}