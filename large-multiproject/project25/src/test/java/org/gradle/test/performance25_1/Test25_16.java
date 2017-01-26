package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_16 {
    private final Production25_16 production = new Production25_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}