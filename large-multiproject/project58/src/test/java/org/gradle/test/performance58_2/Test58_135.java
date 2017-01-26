package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_135 {
    private final Production58_135 production = new Production58_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}