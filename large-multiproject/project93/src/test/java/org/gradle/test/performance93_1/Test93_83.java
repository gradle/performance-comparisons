package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_83 {
    private final Production93_83 production = new Production93_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}