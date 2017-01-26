package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_127 {
    private final Production58_127 production = new Production58_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}