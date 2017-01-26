package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_322 {
    private final Production93_322 production = new Production93_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}