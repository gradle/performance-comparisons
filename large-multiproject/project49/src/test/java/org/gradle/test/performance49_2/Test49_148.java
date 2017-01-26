package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_148 {
    private final Production49_148 production = new Production49_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}