package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_471 {
    private final Production58_471 production = new Production58_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}