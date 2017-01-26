package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_47 {
    private final Production25_47 production = new Production25_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}