package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_159 {
    private final Production51_159 production = new Production51_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}