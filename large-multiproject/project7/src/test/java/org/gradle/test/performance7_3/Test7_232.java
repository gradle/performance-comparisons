package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_232 {
    private final Production7_232 production = new Production7_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}