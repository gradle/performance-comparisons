package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_186 {
    private final Production58_186 production = new Production58_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}