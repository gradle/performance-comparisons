package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_222 {
    private final Production58_222 production = new Production58_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}