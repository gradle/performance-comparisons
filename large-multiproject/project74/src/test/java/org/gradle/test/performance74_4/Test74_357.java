package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_357 {
    private final Production74_357 production = new Production74_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}