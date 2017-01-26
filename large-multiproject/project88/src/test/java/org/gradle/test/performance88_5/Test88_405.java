package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_405 {
    private final Production88_405 production = new Production88_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}