package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_357 {
    private final Production79_357 production = new Production79_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}