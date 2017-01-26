package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_357 {
    private final Production49_357 production = new Production49_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}