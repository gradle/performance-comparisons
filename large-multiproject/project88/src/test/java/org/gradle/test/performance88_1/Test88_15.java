package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_15 {
    private final Production88_15 production = new Production88_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}