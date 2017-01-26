package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_418 {
    private final Production25_418 production = new Production25_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}