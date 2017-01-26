package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_418 {
    private final Production58_418 production = new Production58_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}