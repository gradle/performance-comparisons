package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_204 {
    private final Production4_204 production = new Production4_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}