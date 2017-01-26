package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_457 {
    private final Production93_457 production = new Production93_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}