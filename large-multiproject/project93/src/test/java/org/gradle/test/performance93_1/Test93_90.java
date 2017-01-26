package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_90 {
    private final Production93_90 production = new Production93_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}