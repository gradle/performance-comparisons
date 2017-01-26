package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_98 {
    private final Production58_98 production = new Production58_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}