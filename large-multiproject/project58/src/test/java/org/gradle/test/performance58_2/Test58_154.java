package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_154 {
    private final Production58_154 production = new Production58_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}