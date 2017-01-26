package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_466 {
    private final Production58_466 production = new Production58_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}