package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_46 {
    private final Production25_46 production = new Production25_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}