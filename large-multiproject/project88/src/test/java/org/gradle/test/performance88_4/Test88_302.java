package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_302 {
    private final Production88_302 production = new Production88_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}