package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_313 {
    private final Production25_313 production = new Production25_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}