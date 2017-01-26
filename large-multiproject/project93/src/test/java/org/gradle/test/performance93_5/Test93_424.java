package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_424 {
    private final Production93_424 production = new Production93_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}