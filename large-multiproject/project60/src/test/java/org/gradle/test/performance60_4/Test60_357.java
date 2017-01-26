package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_357 {
    private final Production60_357 production = new Production60_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}