package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_343 {
    private final Production88_343 production = new Production88_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}