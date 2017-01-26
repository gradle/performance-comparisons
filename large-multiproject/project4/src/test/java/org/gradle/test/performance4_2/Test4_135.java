package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_135 {
    private final Production4_135 production = new Production4_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}