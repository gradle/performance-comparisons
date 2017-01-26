package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_6 {
    private final Production25_6 production = new Production25_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}