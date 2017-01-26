package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_143 {
    private final Production25_143 production = new Production25_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}