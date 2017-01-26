package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_220 {
    private final Production58_220 production = new Production58_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}