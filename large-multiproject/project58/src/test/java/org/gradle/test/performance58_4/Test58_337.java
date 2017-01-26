package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_337 {
    private final Production58_337 production = new Production58_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}