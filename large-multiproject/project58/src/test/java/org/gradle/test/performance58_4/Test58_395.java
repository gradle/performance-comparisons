package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_395 {
    private final Production58_395 production = new Production58_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}