package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_357 {
    private final Production43_357 production = new Production43_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}