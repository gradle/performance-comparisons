package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_148 {
    private final Production9_148 production = new Production9_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}