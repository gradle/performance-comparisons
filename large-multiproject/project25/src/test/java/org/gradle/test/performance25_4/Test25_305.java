package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_305 {
    private final Production25_305 production = new Production25_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}