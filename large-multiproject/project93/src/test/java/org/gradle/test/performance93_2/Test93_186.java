package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_186 {
    private final Production93_186 production = new Production93_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}