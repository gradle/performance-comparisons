package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_477 {
    private final Production58_477 production = new Production58_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}