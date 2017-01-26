package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_447 {
    private final Production25_447 production = new Production25_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}