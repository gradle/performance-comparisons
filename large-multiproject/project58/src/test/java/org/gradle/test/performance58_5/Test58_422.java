package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_422 {
    private final Production58_422 production = new Production58_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}