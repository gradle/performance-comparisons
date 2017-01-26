package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_107 {
    private final Production25_107 production = new Production25_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}