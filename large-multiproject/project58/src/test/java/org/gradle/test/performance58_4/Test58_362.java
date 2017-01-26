package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_362 {
    private final Production58_362 production = new Production58_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}