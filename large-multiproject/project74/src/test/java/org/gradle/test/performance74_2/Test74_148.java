package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_148 {
    private final Production74_148 production = new Production74_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}