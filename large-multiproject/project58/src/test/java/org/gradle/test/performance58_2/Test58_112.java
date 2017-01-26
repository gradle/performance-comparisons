package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_112 {
    private final Production58_112 production = new Production58_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}