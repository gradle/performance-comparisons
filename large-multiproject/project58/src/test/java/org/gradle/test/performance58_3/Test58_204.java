package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_204 {
    private final Production58_204 production = new Production58_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}