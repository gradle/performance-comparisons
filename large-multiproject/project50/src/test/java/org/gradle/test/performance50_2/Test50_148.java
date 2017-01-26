package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_148 {
    private final Production50_148 production = new Production50_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}