package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_9 {
    private final Production88_9 production = new Production88_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}