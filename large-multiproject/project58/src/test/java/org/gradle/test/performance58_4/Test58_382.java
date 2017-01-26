package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_382 {
    private final Production58_382 production = new Production58_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}