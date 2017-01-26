package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_148 {
    private final Production3_148 production = new Production3_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}