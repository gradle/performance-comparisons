package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_148 {
    private final Production79_148 production = new Production79_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}