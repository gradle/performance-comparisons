package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_435 {
    private final Production58_435 production = new Production58_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}