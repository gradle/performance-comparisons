package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_329 {
    private final Production58_329 production = new Production58_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}