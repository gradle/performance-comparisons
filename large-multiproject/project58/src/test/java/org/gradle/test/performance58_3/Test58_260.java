package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_260 {
    private final Production58_260 production = new Production58_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}