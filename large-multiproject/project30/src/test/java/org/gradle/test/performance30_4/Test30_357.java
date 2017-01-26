package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_357 {
    private final Production30_357 production = new Production30_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}