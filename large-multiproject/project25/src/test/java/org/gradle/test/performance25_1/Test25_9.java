package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_9 {
    private final Production25_9 production = new Production25_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}