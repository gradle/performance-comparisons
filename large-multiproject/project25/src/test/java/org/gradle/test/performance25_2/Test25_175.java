package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_175 {
    private final Production25_175 production = new Production25_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}