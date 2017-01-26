package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_159 {
    private final Production11_159 production = new Production11_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}