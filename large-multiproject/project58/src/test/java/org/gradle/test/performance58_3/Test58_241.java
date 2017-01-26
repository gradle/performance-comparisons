package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_241 {
    private final Production58_241 production = new Production58_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}