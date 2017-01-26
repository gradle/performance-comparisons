package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_148 {
    private final Production91_148 production = new Production91_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}