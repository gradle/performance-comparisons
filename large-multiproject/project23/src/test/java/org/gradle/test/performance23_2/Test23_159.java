package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_159 {
    private final Production23_159 production = new Production23_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}