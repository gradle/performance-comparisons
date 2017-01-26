package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_148 {
    private final Production46_148 production = new Production46_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}