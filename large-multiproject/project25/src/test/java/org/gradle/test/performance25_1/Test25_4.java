package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_4 {
    private final Production25_4 production = new Production25_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}