package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_283 {
    private final Production88_283 production = new Production88_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}