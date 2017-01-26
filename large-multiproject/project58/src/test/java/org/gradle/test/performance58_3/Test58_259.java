package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_259 {
    private final Production58_259 production = new Production58_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}