package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_231 {
    private final Production58_231 production = new Production58_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}