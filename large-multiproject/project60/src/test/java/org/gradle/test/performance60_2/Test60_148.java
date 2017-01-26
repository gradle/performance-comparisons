package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_148 {
    private final Production60_148 production = new Production60_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}