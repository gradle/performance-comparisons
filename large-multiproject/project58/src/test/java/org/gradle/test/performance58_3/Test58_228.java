package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_228 {
    private final Production58_228 production = new Production58_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}