package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_168 {
    private final Production58_168 production = new Production58_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}