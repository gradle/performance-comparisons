package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_148 {
    private final Production27_148 production = new Production27_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}