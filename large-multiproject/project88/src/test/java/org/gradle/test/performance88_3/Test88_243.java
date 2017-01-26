package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_243 {
    private final Production88_243 production = new Production88_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}