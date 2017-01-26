package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_148 {
    private final Production29_148 production = new Production29_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}