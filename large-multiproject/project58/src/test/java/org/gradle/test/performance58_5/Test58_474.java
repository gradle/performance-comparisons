package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_474 {
    private final Production58_474 production = new Production58_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}