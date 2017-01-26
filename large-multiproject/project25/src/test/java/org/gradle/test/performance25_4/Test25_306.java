package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_306 {
    private final Production25_306 production = new Production25_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}