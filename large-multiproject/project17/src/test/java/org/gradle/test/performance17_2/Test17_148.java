package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_148 {
    private final Production17_148 production = new Production17_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}