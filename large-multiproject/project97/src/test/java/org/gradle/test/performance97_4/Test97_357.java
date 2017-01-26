package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_357 {
    private final Production97_357 production = new Production97_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}