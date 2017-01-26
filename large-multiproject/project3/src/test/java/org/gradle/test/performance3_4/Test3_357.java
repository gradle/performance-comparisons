package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_357 {
    private final Production3_357 production = new Production3_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}