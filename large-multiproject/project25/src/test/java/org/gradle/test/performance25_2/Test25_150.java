package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_150 {
    private final Production25_150 production = new Production25_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}