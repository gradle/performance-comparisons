package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_222 {
    private final Production93_222 production = new Production93_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}