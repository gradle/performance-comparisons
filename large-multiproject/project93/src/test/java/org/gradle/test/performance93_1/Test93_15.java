package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_15 {
    private final Production93_15 production = new Production93_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}