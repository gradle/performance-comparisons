package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_138 {
    private final Production25_138 production = new Production25_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}