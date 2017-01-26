package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_491 {
    private final Production30_491 production = new Production30_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}