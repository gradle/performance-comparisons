package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_492 {
    private final Production25_492 production = new Production25_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}