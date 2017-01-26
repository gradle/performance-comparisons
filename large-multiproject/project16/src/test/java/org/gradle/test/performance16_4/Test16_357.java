package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_357 {
    private final Production16_357 production = new Production16_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}