package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_148 {
    private final Production81_148 production = new Production81_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}