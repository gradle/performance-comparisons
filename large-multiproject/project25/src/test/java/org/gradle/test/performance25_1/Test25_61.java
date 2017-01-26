package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_61 {
    private final Production25_61 production = new Production25_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}