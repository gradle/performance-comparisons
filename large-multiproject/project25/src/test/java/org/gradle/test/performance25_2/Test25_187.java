package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_187 {
    private final Production25_187 production = new Production25_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}