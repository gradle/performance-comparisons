package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_330 {
    private final Production58_330 production = new Production58_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}