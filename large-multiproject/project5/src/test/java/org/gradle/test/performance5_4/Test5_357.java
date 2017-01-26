package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_357 {
    private final Production5_357 production = new Production5_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}