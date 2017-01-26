package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_159 {
    private final Production65_159 production = new Production65_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}