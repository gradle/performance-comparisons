package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_99 {
    private final Production25_99 production = new Production25_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}