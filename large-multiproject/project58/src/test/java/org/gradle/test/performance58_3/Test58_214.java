package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_214 {
    private final Production58_214 production = new Production58_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}