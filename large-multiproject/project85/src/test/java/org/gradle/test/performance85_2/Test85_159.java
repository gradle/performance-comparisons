package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_159 {
    private final Production85_159 production = new Production85_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}