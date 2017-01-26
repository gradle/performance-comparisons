package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_159 {
    private final Production73_159 production = new Production73_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}