package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_159 {
    private final Production45_159 production = new Production45_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}