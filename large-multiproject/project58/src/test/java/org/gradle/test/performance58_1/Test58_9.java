package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_9 {
    private final Production58_9 production = new Production58_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}