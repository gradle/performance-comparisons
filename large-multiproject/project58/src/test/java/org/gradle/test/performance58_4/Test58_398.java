package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_398 {
    private final Production58_398 production = new Production58_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}