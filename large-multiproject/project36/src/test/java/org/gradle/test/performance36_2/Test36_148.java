package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_148 {
    private final Production36_148 production = new Production36_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}