package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_357 {
    private final Production18_357 production = new Production18_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}