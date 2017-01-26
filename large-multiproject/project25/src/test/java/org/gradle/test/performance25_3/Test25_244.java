package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_244 {
    private final Production25_244 production = new Production25_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}