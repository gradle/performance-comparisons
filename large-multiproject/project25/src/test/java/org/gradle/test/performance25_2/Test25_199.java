package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_199 {
    private final Production25_199 production = new Production25_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}