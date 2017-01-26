package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_148 {
    private final Production33_148 production = new Production33_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}