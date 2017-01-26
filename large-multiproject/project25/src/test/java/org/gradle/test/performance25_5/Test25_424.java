package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_424 {
    private final Production25_424 production = new Production25_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}