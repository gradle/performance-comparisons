package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_148 {
    private final Production2_148 production = new Production2_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}