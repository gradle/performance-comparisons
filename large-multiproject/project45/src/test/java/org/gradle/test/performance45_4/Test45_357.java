package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_357 {
    private final Production45_357 production = new Production45_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}