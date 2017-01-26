package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_148 {
    private final Production95_148 production = new Production95_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}