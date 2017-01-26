package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_139 {
    private final Production25_139 production = new Production25_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}