package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_203 {
    private final Production88_203 production = new Production88_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}