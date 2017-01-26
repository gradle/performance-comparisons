package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_482 {
    private final Production25_482 production = new Production25_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}