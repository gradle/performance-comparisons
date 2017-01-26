package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_148 {
    private final Production72_148 production = new Production72_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}