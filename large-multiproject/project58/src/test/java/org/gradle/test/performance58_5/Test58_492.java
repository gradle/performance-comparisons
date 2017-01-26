package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_492 {
    private final Production58_492 production = new Production58_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}