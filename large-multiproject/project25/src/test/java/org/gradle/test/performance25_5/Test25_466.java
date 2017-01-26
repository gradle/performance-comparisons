package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_466 {
    private final Production25_466 production = new Production25_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}