package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_457 {
    private final Production58_457 production = new Production58_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}